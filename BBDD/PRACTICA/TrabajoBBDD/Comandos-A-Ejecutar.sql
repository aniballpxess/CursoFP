-- Tabla de Editoriales
CREATE TABLE Editoriales (
    Id_Editorial NUMBER PRIMARY KEY,
    Nombre_Empresa VARCHAR2(255) NOT NULL,
    Direccion VARCHAR2(255) NOT NULL,
    Telefono_Contacto NUMBER NOT NULL,
    Nombre_Contacto VARCHAR2(100),
    Email_Contacto VARCHAR2(255) NOT NULL
);

-- Tabla de Libros
CREATE TABLE Libros (
    ISBN NUMBER PRIMARY KEY,
    Titulo VARCHAR2(255) NOT NULL,
    Genero VARCHAR2(50),
    Autor VARCHAR2(100) NOT NULL,
    Numero_Edicion NUMBER,
    Formato_Edicion VARCHAR2(50),
    Lugar_Publicacion VARCHAR2(100) NOT NULL,
    Fecha_Publicacion DATE NOT NULL,
    Id_Editorial NUMBER,
    CONSTRAINT fk_Editoriales FOREIGN KEY (Id_Editorial) REFERENCES Editoriales(Id_Editorial)
);



-- Registros de Editoriales
INSERT INTO Editoriales VALUES (404, 'Editorial Anaya', 'Calle Mayor 123', 916664455, 'Juan Pérez', 'juanperez420@anaya.com');
INSERT INTO Editoriales VALUES (212, 'Editorial Pegaso', 'Avenida María Moliner 16', 901444333, NULL, 'anabelen96@gmail.com');
INSERT INTO Editoriales VALUES (69, 'Editorial Animalada', 'Plaza Mayor 112', 902666333, NULL, 'carlosempai69@isekai.com');
INSERT INTO Editoriales VALUES (6, 'Libros Santa María', 'Avenida de la Catedral 36', 699203040, 'María Rodríguez', 'maria6009@gmail.com');
INSERT INTO Editoriales VALUES (666, 'Círculo de lectores', 'Calle de los Perros 616', 918887766, 'Pedro Sánchez', 'pedrosanchezarjon@outlook.com');

-- Registros de Libros
INSERT INTO Libros VALUES (9781234567890, 'El alma del emperador', 'Fantasía', 'Brandon Sanderson', NULL, NULL, 'España', TO_DATE('2018-03-17', 'YYYY-MM-DD'), 212);
INSERT INTO Libros VALUES (9782345678901, 'Cytonic: Defiant', 'Ciencia Ficción', 'Brandon Sanderson', 3, 'Digital', 'USA', TO_DATE('2022-09-22', 'YYYY-MM-DD'), 212);
INSERT INTO Libros VALUES (9783456789012, 'La llamada de Cthulu', NULL, 'H.P. Lovecraft', 5, 'Bolsillo', 'España', TO_DATE('2012-10-30', 'YYYY-MM-DD'), 404);
INSERT INTO Libros VALUES (9784567890123, 'One Piece Vol.33', 'Aventuras', 'Eichiro Oda', 2, 'Tapa blanda', 'España', TO_DATE('2005-04-15', 'YYYY-MM-DD'), 69);
INSERT INTO Libros VALUES (9785678901234, 'One Piece Vol.41', 'Aventuras', 'Eichiro Oda', 2, 'Tapa blanda', 'España', TO_DATE('2007-04-15', 'YYYY-MM-DD'), 69);



-- Para contar los registros
SELECT COUNT (ISBN) AS "Nº de Libros" FROM Libros;
SELECT COUNT (Id_Editorial) AS "Nº de Editoriales" FROM Editoriales;



-- Muestra de datos ordenados
SELECT Titulo AS "Título", Autor AS "Creador", Lugar_Publicacion AS "Zona de Publicación", Fecha_Publicacion AS "Fecha de Publicación" 
    FROM Libros 
    ORDER BY Fecha_Publicacion DESC;
SELECT Nombre_Empresa AS "Editorial", Telefono_Contacto || ' - ' || Email_Contacto || ' - ' || Nombre_Contacto AS "Info de contacto" 
    FROM Editoriales 
    ORDER BY Id_Editorial ASC;



-- Cambia el formato de las direcciones
UPDATE Editoriales SET Direccion = 'av\ de la Catedral 36' WHERE Id_Editorial = 6;
UPDATE Editoriales SET Direccion = 'plz\ Mayor 112' WHERE Id_Editorial = 69;
UPDATE Editoriales SET Direccion = 'av\ María Moliner 16' WHERE Id_Editorial = 212;
UPDATE Editoriales SET Direccion = 'c\ Mayor 67' WHERE Id_Editorial = 404;
UPDATE Editoriales SET Direccion = 'c\ de los Perros 616' WHERE Id_Editorial = 666;

-- Para ver el cambio
SELECT Nombre_Empresa AS "Editorial", Direccion AS "Dirección" 
    FROM Editoriales 
    ORDER BY Id_Editorial ASC;



-- Antes de borrar
SELECT Nombre_Empresa AS "Editorial", Id_Editorial AS "Id" 
    FROM Editoriales 
    ORDER BY Id_Editorial ASC;
SELECT Titulo AS "Título", Id_Editorial AS "Id" 
    FROM Libros 
    ORDER BY ISBN ASC;

DELETE FROM Libros WHERE Id_Editorial = 69;
DELETE FROM Editoriales WHERE Id_Editorial = 69;

-- Después de borrar
SELECT Nombre_Empresa AS "Editorial", Id_Editorial AS "Id" 
    FROM Editoriales 
    ORDER BY Id_Editorial ASC;
SELECT Titulo AS "Título", Id_Editorial AS "Id" 
    FROM Libros 
    ORDER BY ISBN ASC;



-- Para poder contactar por telefono 
SELECT Libros.Titulo AS "Título", Libros.Autor AS "Creador", Editoriales.Nombre_Empresa AS "Editorial", Editoriales.Telefono_Contacto AS "Tlfn."
    FROM Editoriales
    INNER JOIN Libros 
    ON Editoriales.Id_Editorial = Libros.Id_Editorial
    ORDER BY Editoriales.Id_Editorial ASC;
    
-- Para eliminar las editoriales de las que no se tienen libros
SELECT Editoriales.Id_Editorial AS "Id", Editoriales.Nombre_Empresa AS "Editorial", Editoriales.Telefono_Contacto AS "Tlfn."
    FROM Editoriales
    LEFT OUTER JOIN Libros 
    ON Editoriales.Id_Editorial = Libros.Id_Editorial
    WHERE Libros.Id_Editorial IS NULL
    ORDER BY Editoriales.Id_Editorial ASC;



DROP TABLE Editoriales; -- No funciona
DROP TABLE Libros; -- Este sí funciona
DROP TABLE Editoriales; -- Ahora sí funciona