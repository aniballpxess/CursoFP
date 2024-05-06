for $libro in /bib/libro
where $libro/editorial="Addison-Wesley" and $libro/@anyo>1992
return (string($libro/@anyo), $libro/titulo)