<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:template match="/">
    <html>
      <body>
        <table border="1">
          <caption>
            <h2>Título y caracteres 2 a 5 del título de los cds cuyo año está comprendido entre
              1987 y 1996</h2>
          </caption>
          <tr bgcolor="#9acd32">
            <th>Titulo</th>
            <th>caracteres 2 a 5 del título</th>
          </tr>
          <xsl:for-each select="catalogo/cds/cd[anio &gt; 1986 and anio &lt;1997]">
            <tr>
              <td>
                <xsl:value-of select="titulo" />
              </td>
              <td>
                <xsl:value-of select="substring(titulo,2,4)" />
              </td>
            </tr>
          </xsl:for-each>
        </table>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>