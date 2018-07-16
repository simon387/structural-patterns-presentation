# design patterns strutturali

Thinkopen Academy 2018-07-19

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

## un po' di storia

+ I design patterns hanno raggiunto molta popolarità nel mondo della **computer science** con il libro *Design Patterns: Elements of Reusable Object-Oriented Software* scritto dalla **Gang of Four**

---

## Pattern

individua un'**IDEA**, uno schema **GENERALE E RIUSABILE**

Non è paragonabile ad un componente riusabile perchè:

+ non è un oggetto fisico
+ deve essere contestualizzato all'interno del particolare problema applicativo

---

## Pattern

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

## Cosa fornisce un design pattern al progettista software?

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

## non complessi né domain-specific

Non sono rivolti alla specifica applicazione ma riusabili in parti di applicazioni diverse

---

## caratteristiche

Un Design Pattern

+ nomina
+ astrae
+ identifica

gli aspetti chiave di una struttura comune di design che la rendono utile nel contesto del riuso in ambito object-oriented

---

## caratteristiche

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

