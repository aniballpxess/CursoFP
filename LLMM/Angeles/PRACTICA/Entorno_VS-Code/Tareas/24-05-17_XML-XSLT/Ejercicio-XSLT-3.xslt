<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="3.0">
  <xsl:template match="/personal">
    <h2>PERSONAS</h2>
    <table border="1">
      <tr style="background-color: #0000FF;">
        <th>Nombre</th>
        <th>Apellido</th>
        <th>Sexo</th>
      </tr>
      <xsl:for-each select="persona">
      <tr>
        <td><xsl:value-of select="nombre" /></td>
        <td><xsl:value-of select="apellido" /></td>
        <td><xsl:value-of select="@sexo" /></td>
      </tr>
      </xsl:for-each>
    </table>
  </xsl:template>
</xsl:stylesheet>