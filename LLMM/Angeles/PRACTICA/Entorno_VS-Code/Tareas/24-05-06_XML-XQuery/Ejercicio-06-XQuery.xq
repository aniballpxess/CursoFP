for $libro in /bib/libro
where count($libro/autor)>1
return (string($libro/@anyo), $libro/titulo)