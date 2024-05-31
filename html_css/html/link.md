# Code pen
XMl lernen.
XSD schema  lernen
Xml see genauso wie Html
Xmlns; xsi ...

dazu  gehören Parent Child Relation die mit ein Tag versehen können
Attribut von Elemente werden direct im Tag beschrieben
 beispiel folgt:
<Desk>
<Cup capacity="150" manufactured="01.01.2003" upside="false">
</Cup>
</Desk>
xmlns: Dieses Attribut definiert den Standard-Namensraum für das Dokument. Im Beispiel wird http://www.example.com/officeDesk verwendet. Elemente ohne Präfix gehören zu diesem Namensraum.
xmlns
: Dieses Attribut definiert den Namensraum für die XML Schema-Instanz. Der Standardwert ist http://www.w3.org/2001/XMLSchema-instance, der für das Schema-Standortattribut xsi:schemaLocation benötigt wird.
xmlns
: Dieses Attribut definiert den Namensraum für XML-Schema-Elemente. Der Standardwert ist http://www.w3.org/2001/XMLSchema.
Wie das eingebettete XSD-Schema funktioniert
targetNamespace: Dieser Attributwert http://www.example.com/officeDesk definiert den Namensraum für die Elemente und Attribute in diesem Schema.
elementFormDefault="qualified": Dies bedeutet, dass Elemente im Zielnamensraum qualifiziert sein müssen (mit Präfix oder Standardnamensraum).
Vorteile der Verwendung von Namensräumen
Vermeidung von Namenskollisionen: Verschiedene XML-Dokumente können dieselben Element- oder Attributnamen haben, die durch die Verwendung von Namensräumen unterschieden werden können.
Klarheit und Struktur: Namensräume helfen dabei, die Struktur des Dokuments klar zu definieren und zu verstehen, welche Elemente zu welchem Schema gehören.