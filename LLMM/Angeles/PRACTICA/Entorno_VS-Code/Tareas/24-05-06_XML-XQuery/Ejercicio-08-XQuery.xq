for $apellido in distinct-values(//autor/apellido)
order by $apellido
return $apellido