for $libro in /bib/libro
where count($libro/autor)=0
return (string($libro/@anyo), $libro/titulo)