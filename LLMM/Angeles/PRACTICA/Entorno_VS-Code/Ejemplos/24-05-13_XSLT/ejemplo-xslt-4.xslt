<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:template match="/">
    <html>
      <body>
        <table border="1">
          <caption>
            <h2>Título, artista y año de los cds cuyo año está comprendido entre 1987 y 1996</h2>
          </caption>
          <tr bgcolor="#9acd32">
            <th>Titulo</th>
            <th>Artista</th>
            <th>año</th>
          </tr>
          <xsl:for-each select="catalogo/cds/cd[anio &gt; 1986 and anio &lt;1997]">
            <tr>
              <td>
                <xsl:value-of select="titulo" />
              </td>
              <td>
                <xsl:value-of select="artista" />
              </td>
              <td>
                <xsl:value-of select="anio" />
              </td>
            </tr>
          </xsl:for-each>
          <tr>
            <th colspan="2">Número de cds entre 1987 y 1996</th>
            <th>
              <xsl:value-of select="count(//cd[anio &lt; 1997]) - count(//cd[anio &lt; 1986])" />
            </th>
          </tr>
        </table>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>