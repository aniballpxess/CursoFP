xquery version "1.0";
<html>
  <body>
    <table border="1">
    { 
      for $x in doc("C:\CursoFP\ASIGNATURAS\LLMM\Angeles\PRACTICA\Entorno_VS-Code\Ejemplos\24-05-06_XQuery\libros.xml")/libreria/libro
      return $x/titulo
    }
    </table>
  </body>
</html>