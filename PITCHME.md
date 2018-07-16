# design patterns strutturali

Thinkopen Academy 2018-07-19

Note:
Remember to explain why it's for everyone: no sign-up, nothing to install.
Just MD. Then git-commit.

---

## chi sono

Simone Celia, FullStack Java Developer, lavoro nell'ambito della consulenza informatica da 5 anni, in Thinkopen da 2

---

## dove trovare queste slide

[https://github.com/simon387/structural-patterns-presentation](https://github.com/simon387/structural-patterns-presentation)

---

## riferimenti

+ Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides, “Design Patterns: Elements of Reusable Object Oriented Software“.
+ [https://www.docenti.unina.it/webdocenti-be/allegati/materiale-didattico/98381](https://www.docenti.unina.it/webdocenti-be/allegati/materiale-didattico/98381)
+ [https://www.journaldev.com](https://www.journaldev.com)
Note:
https://www.journaldev.com/1827/java-design-patterns-example-tutorial
+ wikipedia
+ stackoverflow

---

# iniziamo!

---

## un po' di storia

+ Introdotti dall'architetto Christopher Alexander. Architetto edile, non software!

> "Ogni pattern descrive un problema che si presenta ferquentemente, e quindi descrive il nucleo della soluzione così che si possa impiegarla milioni di volte, senza produrre due volte la stessa realizzazione"

---

## un po' di storia

+ Il principio è ugualmente valido, anche se riferito ad oggetti, classi ed interfacce piuttosto che ad elementi architettonici come muri, archi, pilastri, ecc... .

---

## un po' di storia (continua)

+ I design patterns hanno raggiunto molta popolarità nel mondo della **computer science** con il libro *Design Patterns: Elements of Reusable Object-Oriented Software* scritto dalla **Gang of Four**

---

## Pattern

individua un'**IDEA**, uno schema **GENERALE E RIUSABILE**

Non è paragonabile ad un componente riusabile perchè:

+ non è un oggetto fisico
+ deve essere contestualizzato all'interno del particolare problema applicativo

---

## Pattern (continua)

due istanze di uno stesso pattern (ad esempio applicate a problemi diversi) tipicamente sono diverse proprio per la contestualizzazione in domini differenti.

---

## Scopo dei Patterns

+ Catturare l'esperienza e la *saggezza* degli esperti
+ Evitare di reinventare ogni volta le stesse cose

---

## Cosa fornisce un design pattern al progettista software?

+ Una soluzione codificata e consolidata per un problema ricorrente
+ Un'astrazione di granualità e livello di astrazione più elevati di una classe

---

## Cosa fornisce un design pattern al progettista software? (continua)

+ Un supporto alla comunicazione delle caratteristiche del progetto
+ Un modo per progettare software con caratteristiche predefinite
+ Un supporto alla progettazione di sistemi complessi

---

## Definizione

Ogni pattern descrive un problema specifico che ricorre più volte e descrive il nucleo della soluzione a quel problema, in modo da poter utilizzare tale soluzione milioni di volte.

---

## Abbastanza astratti

In modo da poter essere condivisi da progettisti con punti di vista diversi e che conoscono tecnologie e linguaggi diversi

---

## né complessi né domain-specific

Non sono rivolti alla specifica applicazione ma riusabili in parti di applicazioni diverse

---

## caratteristiche

Un Design Pattern

+ nomina
+ astrae
+ identifica

gli aspetti chiave di una struttura comune di design che la rendono utile nel contesto del riuso in ambito object-oriented

---

## caratteristiche (continua)

Un Design Pattern identifica:

+ le classi (e le istante) partecipanti
+ le associazioni ed i ruoli
+ le modalità di collaborazione tra le classi coinvolte
+ la distribuzione delle responsabilità nella soluzione del particolare problema di design considerato

---

## tipologie di pattern

Esistono diverse tipologie di pattern, che si differenziano principalmente per la scala ed il livello di astrazione:

1. Architectural Pattern
2. **Design Pattern**
3. Idioms

---

## architectural pattern

+ Utili per strutturare un sistema in sottosistemi

---

## Design Pattern

+ Operano essenzialmente a livello di un singolo sottosistema evidenziando le carattersistiche delle classi coinvolte e delle associazioni tra class

---

## Idioms

+ Utili per l'implementazione di specifici aspetti di design in un particolare linguaggio di programmazione
+ *Common Practice*

---

## come sono fatti i design patterns

+ nome
+ problema
+ soluzione
+ conseguenze

---

## nome

+ il **nome** del pattern, è utile per descrivere la sua funzionalità in una o due parole.

---

## problema

+ il **problema** nel quale il pattern è applicabile. Spiega il problema e il contesto, a volte descrive dei problemi specifici del design mentre a volte può descrivere strutture di classi e oggetti. Può anche includere una lista di condizioni che devono essere soddisfatte precedentemente perchè il pattern possa essere applicato

---

## soluzione

+ la **soluzione** che descrive in modo astratto come il pattern risolve il problema. Descrive gli elementi che compongono il design, le loro responsabilità e le collaborazioni

---

## conseguenze

+ le **conseguenze** portate dall'applicazione del pattern. Spesso sono tralasciate ma sono importanti per poter valutare i costi-benefici dell'utilizoo del pattern.

---

## esempio descrizione DP

+ **Nome e classificazione** del pattern
+ **Sinonimi**: altri nomi del pattern
+ **Scopo**: cosa fa il pattern? a cosa serve?
+ **Motivazione**: scenario che illustra un design problem
+ **Applicabilità**: situazioni in cui si applica il pattern
+ **Struttura**: rappresentazione delle classi in stile OMT
Note:
OMT = is an object modeling approach for software modeling and designing [link](https://en.wikipedia.org/wiki/Object-modeling_technique)

+ **Partecipanti**: classi e oggetti inclusi nel pattern

---

## esempio descrizione DP (continua)

+ **Collaborazioni**: come i partecipanti collaborano
+ **Conseguenze**: come consegue i suoi obiettivi il pattern?
+ **Implementazione**: che tecniche di codifica sono necessarie?
+ **Codice di esempio**: scritto in un linguaggio ad oggetti
+ **Usi noti**: esempi d'applicazione del pattern in sistemi reali
+ **Pattern correlati**: con quali pattern si dovrebbe usare?

---

## categorie di pattern

Esistono diverse categorie di pattern, spesso sono divisi per funzione (purpose) e dominio (scope) del pattern

---

## funzione (purpose), ovvero cosa fa il pattern

+ **Creazionali**: forniscono meccanismi per la creazione di oggetti
+ **Strutturali**: gestiscono la separazione tra interfaccia e implementazione e le modalità di composizione tra oggetti
+ **Comportamentali**: consentono la modifica del comportamento degli oggetti minimizzando la necessità di cambiare il codice

---

## dominio (scope), indica se il pattern si applica a classi o oggetti

+ **Class pattern**: si focalizzano su relazioni fra classi e sottoclassi. Tipicamente si riferiscono a situazioni statiche, ovvero riguadano il compile-time
+ **Object pattern**: si focalizzano su oggetti (istanze) e le loro relazioni. Tipicamente si riferiscono a situazioni dinamiche (run-rime).

Note:
la differenza è comunque molto sfumata

---

## categoria creational

la vedrete domani ¯\\_(ツ)_/¯

---

## categoria structural

+ sono dedicati alla composizione di classi e oggetti per creare delle strutture più grandi
+ è possibile creare delle classi che ereditano da più classi per consentire di utilizzare proprietà di più superclassi indipendenti
+ ad esempio permettono di far funzionare insieme delle librerie indipendenti

---

## elenco pattern structural GoF

|DP | Descrizione |
| :------------ | :---------- |
| Adapter       | Converte l'interfaccia di una classe in un'altra permettendo a due classi di lavorare assieme anche se hanno interfacce diverse|
| Bridge        | Disaccoppia un'astrazione dalla sua implementazione in modo che possano variare in modi indipendente|

---

|DP | Descrizione |
| :------------ | :---------- |
| Composite     | Compone oggetti in strutture ad albero per implementare delle composizioni ricorsive|
| Decorator     | Aggiunge nuove responsabilità ad un oggetto in modo dinamico, è alternativa alle sottoclassi per estendere le funzionalità|
| Facade        | Provvede un'interfaccia unificata per le interfacce di un sottosistema in modo da rendere più facile il loro utilizzo|

---

|DP | Descrizione |
| :------------ | :---------- |
| Proxy         | Provvede un surrogato di un oggetto per controllarne gli accessi|
| Flyweight     | Usa la condivisione per supportare in modo efficiente un gran numero di oggetti con fine granualità|

---

## Adapter

+ è usato per far lavorare assieme interfacce non correlate.
+ l'oggetto che unisce queste interfacce è chiamato **Adapter**

---

## Adapter

Un esempio di Adapter nel mondo reale potrebbe essere quello dei carica batterie per cellulare.
Una batteria potrebbe avere bisogno di 3 Volt per caricarsi mentre la normale presa di corrente ne ha 220.
Quindi il carica batterie fa da *Adapter* tra la presa di corrente e la batteria.
Note:
abbiamo 2 classi, Volt che misura la tensione e socket che produce una tensione costante di 240v
Volt
Socket
SocketAdapter
SocketClassAdapterImpl
AdapterPatternTest

@fa[arrow-down]

+++?code=StructuralPatterns/src/main/java/adapter/Volt.java&lang=java&title=Volt.java

@fa[arrow-down]

+++?code=StructuralPatterns/src/main/java/adapter/Socket.java&lang=java&title=Socket.java

@fa[arrow-down]

+++?code=StructuralPatterns/src/main/java/adapter/SocketAdapter.java&lang=java&title=SocketAdapter.java

@fa[arrow-down]

+++?code=StructuralPatterns/src/main/java/adapter/SocketClassAdapterImpl.java&lang=java&title=SocketClassAdapterImpl.java

@fa[arrow-down]

+++?code=StructuralPatterns/src/main/java/adapter/AdapterPatternTest.java&lang=java&title=AdapterPatternTest.java

Note:
@[1,3-6](Present code found within any repo source file.)
@[8-18](Without ever leaving your slideshow.)
@[19-28](Using GitPitch code-presenting with (optional) annotations.)

---