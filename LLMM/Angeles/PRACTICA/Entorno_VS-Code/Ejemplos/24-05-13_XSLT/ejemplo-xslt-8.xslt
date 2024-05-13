<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:template match="/">
    <html>
      <body>
        <h2>Nombre de las canciones de los Cds cuyo titulo empeza por C</h2>
        <ul>
          <xsl:variable name="cod" select="//cds/cd/@cod_cd" />
          <xsl:for-each select="//cds/cd">
            <xsl:if test="starts-with(titulo,'C')">
              <xsl:if test="@cod_cd=$cod">
                <li>
                  <b>nombre del Cd:</b>
                  <xsl:value-of select="titulo" />
                </li>
                <li>
                  <b>nombre de las canciones:</b>
                </li>
                <ul>
                  <xsl:for-each select="canciones/cancion">
                    <li>
                      <xsl:value-of select="titulo" />
                    </li>
                    <br />
                  </xsl:for-each>
                </ul>
              </xsl:if>
            </xsl:if>
          </xsl:for-each>
        </ul>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>