<libro>
{
for $libro in /bib/libro
return ($libro/titulo, count($libro/autor))
}
</libro>