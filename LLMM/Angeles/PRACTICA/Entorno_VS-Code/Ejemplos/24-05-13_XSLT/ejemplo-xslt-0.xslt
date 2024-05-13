<xsl:stylesheet version="3.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:template match="/">
    <html>
      <body>
        <h2>Mi coleccion de Cds</h2>
        <xsl:apply-templates />
      </body>
    </html>
  </xsl:template>
  <xsl:template match="cd">
    <p>
      <xsl:apply-templates select="titulo" />
      <xsl:apply-templates select="artista" />
    </p>
  </xsl:template>
  <xsl:template match="titulo"> Titulo: <span style="color:#ff0000">
      <xsl:value-of select="." />
    </span>
    <br />
  </xsl:template>
  <xsl:template match="artista"> Artista: <span style="color:#00ff00">
      <xsl:value-of select="." />
    </span>
    <br />
  </xsl:template>
</xsl:stylesheet>