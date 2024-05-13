<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:template match="/">
    <html>
      <body>
        <table border="1">
          <caption>
            <h2>Título, empresa, artista y precio de mis cds con precio mayor a 10 de Columbia</h2>
          </caption>
          <tr bgcolor="#9acd32">
            <th>Titulo</th>
            <th>Empresa</th>
            <th>Artista</th>
            <th>Precio</th>
          </tr>
          <xsl:for-each select="catalogo/cds/cd">
            <xsl:if test="precio &gt; 10">
              <xsl:if test="empresa='Columbia'">
                <tr>
                  <td>
                    <xsl:value-of select="titulo" />
                  </td>
                  <td>
                    <xsl:value-of select="empresa" />
                  </td>
                  <td>
                    <xsl:value-of select="artista" />
                  </td>
                  <td>
                    <xsl:value-of select="precio" />
                  </td>
                </tr>
              </xsl:if>
            </xsl:if>
          </xsl:for-each>
        </table>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>