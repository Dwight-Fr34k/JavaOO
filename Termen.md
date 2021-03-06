# Termen in Java OO
Geen enkel van de volgende termen zijn per-se te kennen maar vallen wel in het dagdagelijks jargon van een programmeur. Het is dus best de betekenis van deze te kennen. Het is alsnog vrijblijvend en gebruikt als een hulp voor het lezen van de theorie. 
## H1: Inleiding
Term | Verklaring
--- | ---
**Klasse** | Een "blueprint" waarin we code samenbrengen (velden, methoden ...).
**Object** | Een instantie van een klasse.
**Lagen** | Een theoretische opdeling van klassen.
**IO** | *In- & Output*.
**IDE** | *Integrated Development Environment*; Programma waarin je codeert & test.
**Syntax-Highlighting** | Tool van de IDE die diverse sleutelwoorden en termen aanduid in vastgelegde kleuren.
**API** | *Application Programming Interface*; Een bijkomende tool van de IDE die documentatie voorziet.
**Package** | Ook wel *namespace* genoemd, de constructie die klasses bij elkaar koppelt. Praktisch gezien word een package vaak als een laag gebruikt.
**Import** | Keyword die de huidige package toegang geeft tot een ander package.
## H2: Klassen en objecten
Term | Verklaring
--- | ---
**Scope** | De ruimte waarin een variabele bestaat en kan gebruikt worden.
**Type** | Het type van een variabele.
**Primitief Type** | Een variabele die de effectieve waarde bevat. (vb. integer)
**Object Type** | Een variabele die een referentie bevat naar de locatie van het object met de effectieve waarde. (vb. String) 
**GC** | *Garbage Collector*; Een tool van de IDE die objecten zonder referentie verwijdert.
**Velden** | Plek om variabelen te stockeren in een klasse.
**Constructoren** | Speciale methode die een object aanmaakt van een gekozen klasse.
**Member-Operator** | (.) gebruikt om 2 members aan elkaar te koppelen. (klasses of objecten en methoden of velden)
**Default constuctor** | Constructor zonder parameters die als er geen andere constuctor is, autonoom wordt toegevoegd.
**Method overloading** | Eén zelfde naam voor methoden gebruiken maar met een andere combinatie van parameters.
**This** | Keyword om aan te topnen dat we het veld bedoelen van het huidig object. (te gebruiken met de member operator)
**Null** | Een referentie naar nergens i.p.v. een object.
**Private** | Acces specifier die enkel toegang verleent in de klasse waarin hij aangemaakt is.
**Public** | Acces specifier die toegang verleent overal.
**Getter** | Ook wel *Accessor* genoemd, een methode die een veld naar buiten verleent, zonder rekenening te houden met de AS.
**Setter** | Ook wel *Mutuator* genoemd, een methode die een veld aanpast zonder rekenening te houden met de AS.
**Object methode** | Een methode die uitgevoerd moet worden in combinatie met een Object (member operator).
**Klasse methode** | Ook wel *Statische methode*;Een methode die uitgevoerd moet worden in combinatie met een Klasse (member operator).
**Black box** | Een term die ook buiten Java word gebruikt voor een constructie waarvan men de werking niet kent.
**Exceptie** | Een code interuptor die opgesmeten word bij onverwachte situaties. (Zelf gekozen of autonoom)
**Try-Catch** | Code structuur die gemaakt is om gevoelige code af te bakenen. Deze stopt dan ook excepties, en voert dan de catch uit.
**Checked Exception** | Exception die moet opgevangen worden met een try-catch. Dit is meestal bij inlezen van data.
**Unchecked Exception** | Exception die niet moet opgevangen worden met een try-catch.
**Throw** | Keyword dat gebruikt wordt om een exceptie manueel op te gooien
## H3: Hergebruiken van klassen
Term | Verklaring
--- | ---
**Compositie** | Het principe van een veld op te vullen met een ander object. (heeft-een relatie)
**Overerving** | Het principe van een bestaande klasse uit te breiden. (is-een relatie)
**Method overiding** | Het concept van methodes van de superklasse te herschrijven met de zelfde signatuur. Niet te verwarren met *Method overloading*.
**Extends** | Keyword gebruikt om aan te tonen waar de huidige klasse van afgeleid is. Komt na de klasse naam in de klasse definiëring.
**Super** | Keyword om aan te duiden dat we teruggrijpen naar de van-afgeleide klasse. Zo kan men met de memberoperator ook zijn methoden en velden aanspreken. De super word ook gebruikt als term om naar de van-afgeleide klasse te benoemen.
**Access specifier** | Een concept van keywords die aangeven welke code toegang heeft tot dit veld/methode. Deze zijn dan ook respectievelijk *Private, None, Protected, Public*.
**Protected** | AS die tussen private en public ligt. De toegang word ook verleend aan afgeleide klassen.
**Het type Object** | De "moeder-klasse" hiervan zijn alle andere klassen afgeleid. Deze bevat dus velden die elke klasse implementeerd.
**ToString** | Eén van de moeder-methoden van Object. De taak van deze methode is het textueel weergeven van een object van de klasse.
**Equals** | Eén van de moeder-methoden van Object. De taak van deze methode is het vergelijken van 2 objecten van de zelfde klasse.
**Casten** | Het concept om een object of waarde van type te veranderen. Denk aan integers naar longs maar ook Strings naar user-defined klassen.
**Downcast** | Een downcast is een term om van een super klasse te casten naar een afgeleide ervan. 
**Upcast** | Een upcast is een term om van een afgeleide klasse terug (tijdelijk) te casten naar de super.
**Impliciet** | Impliciet is een term die ook buiten Java gebruikt wordt. Deze betekend "zonder uitleg" dit kunnen dus vanzelfsprekende casts zijn zoals een int naar float.
**Expliciet** | Expliciet is een term die ook buiten Java gebruikt wordt. Deze betekend "met uitleg" dit is dus het specifieren naar welk type er gecast word.
**InstanceOf** | Een operator die nuttig is om te controleren of een object van een bepaalde klasse is. Geeft een booleans resultaat terug.
## H4: Arrays van objecten
Term | Verklaring
--- | ---
**ArrayList** | Een collectie object dat intern word gerepresenteerd als een Array. Kan aanzien worden als een dynamisch schalende array.
**Interface** | Een lege *klasse* die gebruikt wordt om de signatuur vast te leggen zonder inhoud. Kan aanzien worden als een contract van velden en methoden die verwacht worden indien geimplementeerd.
**Icompareable** | De compareable interface. Indien geimplementeerd maakt die het mogelijk met een equals methode 2 objecten te vergelijken en dus ook te sorteren.
**Implements** | Keyword gebruikt om interfaces te gebruiken. Word na overervingen geplaatst in de klasse benaming.