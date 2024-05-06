for $libro in /bib/libro
order by $libro/@anyo
return ($libro/titulo, string($libro/@anyo))