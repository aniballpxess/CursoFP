<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="3.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:template match="/personal/persona">
  <xsl:if test="@sexo='Mujer'">
    <xsl:value-of select="nombre" />
    <xsl:value-of select="apellido" />
    <xsl:value-of select="@sexo" />
    <br />
  </xsl:if>
  </xsl:template>
</xsl:stylesheet>