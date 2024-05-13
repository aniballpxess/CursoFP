
<xsl:stylesheet version="3.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:template match="/">
    <html>
      <body>
        <h2>Mi coleccion de Cds</h2>
        <table border="1">
          <tr bgcolor="#9acd32">
            <th>Titulo</th>
            <th>Artista</th>
            <th>Precio</th>
          </tr>
          <xsl:for-each select="catalogo/cds/cd">
            <tr>
              <td><xsl:value-of select="titulo" /></td>
              <xsl:choose>
                <xsl:when test="precio >= 10">
                  <td bgcolor="#ff00ff"><xsl:value-of select="artista" /></td>
                </xsl:when>
                <xsl:otherwise>
                  <td><xsl:value-of select="artista" /></td>
                </xsl:otherwise>
              </xsl:choose>
              <td><xsl:value-of select="precio" /></td>
            </tr>
          </xsl:for-each>
        </table>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>