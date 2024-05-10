<table border="1">
<tr><td>Clase</td><td>Profesor</td><td>Plazas</td></tr>
{
for $x in /bailes/baile
  let $nombre_baile := $x/nombre
  let $nombre_profesor := $x/profesor
  let $numero_plazas := $x/plazas
  return <tr><td>{data($nombre_baile)}</td><td>{data($nombre_profesor)}</td><td>{data($numero_plazas)}</td></tr>
}
</table>