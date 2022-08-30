<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:template match="/">
        <html>
            <head>
                <meta charset="UTF-8" />
                <meta http-equiv="X-UA-Compatible" content="IE=edge" />
                <meta name="viewport" content="width=device-width, initial-scale=1.0" />
                <title>
                    <xsl:value-of select="name(/*)" />
                </title>
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous" />
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
            </head>
            <body>
                <h2 class="text-light bg-dark mx-2">
                    <xsl:value-of select="/*/learner/preceding-sibling::comment()" />
                </h2>
                <br />
                <br />
                <!-- <xsl:apply-templates select="contacts/contact" /> -->
                <div class="container">
                    <table class="table table-dark table-striped">
                        <thead style="background-color:'burlywood'">
                            <tr>
                                <th>ID</th>
                                <th>NAME</th>
                                <th>E-MAIL</th>
                                <th>MOBILE NO</th>
                                <th>SUBJECT</th>
                                <th>Status</th>

                            </tr>
                        </thead>
                        <tbody>
                            <xsl:for-each select="learners/learner">
                                <!-- <xsl:for-each select="//learner"> -->
                                <!-- <xsl:for-each select="/learners/*"> -->
                                <!-- <xsl:for-each select="/learners/learner[marks>=85]"> -->
                                <!-- <xsl:for-each select="/learners/learner[last()]"> -->
                                <!-- <xsl:for-each select="/learners/learner[1]"> -->
                                <xsl:sort select="marks" order="descending" />
                                <!-- <xsl:if test="marks>=85"> -->
                                <xsl:comment>
                                    iterating through contact of:
                                    <xsl:value-of select="name"></xsl:value-of>
                                </xsl:comment>
                                <tr>
                                    <td>
                                        <xsl:value-of select="@learner_id" />
                                    </td>
                                    <td>
                                        <xsl:value-of select="name" />
                                    </td>
                                    <td>
                                        <xsl:value-of select="email" />
                                    </td>
                                    <td>
                                        <xsl:value-of select="mobile" />
                                    </td>
                                    <td>
                                        <xsl:value-of select="subject" />
                                    </td>
                                    <td>
                                        <!-- A+ -->
                                        <xsl:choose>
                                            <xsl:when test="marks >= 85">
                                                A+
                                            </xsl:when>
                                            <xsl:otherwise>
                                                A
                                            </xsl:otherwise>
                                        </xsl:choose>
                                    </td>
                                </tr>
                                <!-- </xsl:if> -->
                            </xsl:for-each>
                        </tbody>
                    </table>
                </div>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>