(:FLWOR XQuery:)
for $x in doc("C:\CursoFP\ASIGNATURAS\LLMM\Angeles\PRACTICA\Entorno_VS-Code\Ejemplos\24-05-06_XQuery\libros.xml")/libreria/libro
where $x/precio>30
order by $x/titulo
return $x/titulo

(:for simple:)
for $x in (1 to 3) return <libro>{$x}</libro>

(:bucle XQuery:)
for $x at $i in /libreria/libro/titulo
return <libro>{$i}. {data{$x}}</libro>

(:logica bucle:)
for $x in (10,20), $y in (100,200)
return <test>x={$x} and y={$y}</test>

(:uso let:)
let x:=(1 to 5)

(:uso string con ATR:)
for $x in /libreria/libro
return ($x/titulo, string($x/@categoria))

(:uso etiquetas HTML:)
for $x in /libreria/libro
return <h1>{$x/titulo}</h1>