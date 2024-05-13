for $x in /bailes/baile
let $tipo_cuota := $x/precio/@cuota
let $nombre_profesor := $x/profesor
where $tipo_cuota="mensual"
return /bailes/baile