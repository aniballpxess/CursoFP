<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:template match="/">
    <html>
      <body>
        <table border="1">
          <caption>
            <h2>Título y artista de todos mis cds</h2>
          </caption>
          <tr bgcolor="#9acd32">
            <th>Titulo</th>
            <th>Artista</th>
          </tr>
          <xsl:for-each select="catalogo/cds/cd">
            <tr>
              <td>
                <xsl:value-of select="titulo" />
              </td>
              <td>
                <xsl:value-of select="artista" />
              </td>
            </tr>
          </xsl:for-each>
        </table>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>