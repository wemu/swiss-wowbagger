package guru.nidi.wowbagger
import guru.nidi.wowbagger.Wowbagger.trimLines

object Subjects {
    val list = """
m Aargouer Outofahrer
f Achermähre
n Alpechalb
m Aff
m Angschthas
m Arschchäfer
f Arschgige
m Arschgigu
n Arschkantefilet
m Aschi
n Aupechaub
f Baabe
f Bagglimoore
n Baslerbebbi
m Batzechlemmer
m Bettseicher
n Bipperlisi
m Bisibueb
n Bisibääbi
m Bisitrinker
m Blickläser
m Blödian
m Blöffsack
n Bohneross
f Bohnestange
m Braschti
m Brämeständer
m Bschishung
f Bännesou
f Bärgänte
m Bäse
f Bäserääf
m Bääggisiech
f Bire
m Birewixer
m Bhouptisiech
m Bööggefrässer
m Büffu
m Bünzli
m Bürokolleg
m Chafler
m Chaflicheib
m Chatzestrecker
m Cheib
m Chiubi-Gigu
f Chleechue
m Chnorzi
m Chotzchübu
m Chouderi
m Chrüppucheib
m Chrüppuhung
n Chuderluuri
n Chuefüdle
m Chutzemischt
m Chüttenechotzer
m Chuttlefrässer
m Dräcksack
n Eiterbibeli
m Figgfähler
n Finöggeli
m Frässhung
m Fuschti
m Futz
m Futzbuur
m Füdlibürger
n Fägnäscht
f Färlimore
m Fötzu
m Fötzucheib
m Fötzusiech
m Galööri
m Gartefeschtplouderi
f Gibe
m Gigu
m Gigusiech
m Gitzeler
m Gitzgnäpper
n Gjätt
m Globivogu
m Glögglifrösch
m Glünggi
m Glüschteler
m Gnieti
m Gorilla Blauarsch
m Grittibänz
m Groggermooslaferi
m Gränni
m Grüsu
m Gschtabi
m Gschtabicheib
m Gummihaus
f Gumsle
m Gäderhächu
n Gäderiwyb
n Gäderimanndli
n Güezi
m Haagge
n Haaghuuri
m Habasch
f Hafehuer
m Hagu
m Heilandtonner
m Hornochs
m Hudilump
n Hundshammli
f Hundsniere
m Hueresiech
m Hurli-Gwaag
m Hurrlibueb
m Höseler
m Höuzu
m Im-Kreisu-Links-Blinker
m Krouteri
n Kamuff
m Laferi
m Lafericheib
m Laferisiech
m Laggaff
m Lappi
m Lauerisiech
m Lumpehung
m Lyribänz
m Lümu
f Memme
n Miuchmubi
n Mischtschwibeli
m Mongo
m Mongobilly
f Moore
m Motzi
m Mulaff
m Muggigring
m Märebrätscher
m Möögigring
m Möngu
m Möff
m Mürggu
m Nasepööggu
m Närvsack
m Pajass
f Panne
m Plouderi
m Pflock
m Pflotsch
m Pfoschte
m PHP-Programmierer
m Pralaaggi
m Praschaueri
f Pumpi
m Püntu
m Püüru
m Quadratspüntu
n Ranggifüdle
n Rääf
f Rosshode
m Rosspigger
n Rybise
f Schabe
m Schafsecku
m Schibützu
m Schiissigurgler
m Schiissiputzer
m Schissgring
m Schlarpisiech
m Schlimschisser
m Schminggu
m Schnuddergoof
m Schnudderi
m Schnäbizägg
m Schnäbichätscher
m Schnäbischpienzler
f Schnädere
m Schwafler
m Schwanzlurch
m Schwauderi
m Schwüppu
m Schöggeler
m Schönwätterschlöfler
m Secku
m Seckupeter
m Siech
m Solothurner
m Soucheib
m Souhung
f Soumoore
m Sousiech
m Spränzu
m Stürmi
m Stärnesiech
m Stürmisiech
m Söiferludi
m Söiniggu
m Süchu
m Süffu
m Sürmu
n Theresli
m Toggu
m Totsch
m Traliwatsch
m Troschtpris
f Träne
m Tröchni
m Tröunagu
m Tschaupisiech
m Tschirpegigu
m Tschugger
m Tschumppuhung
m Tschumpu
m Tubu
n Tüpfi
n Tussi
m Töfflibueb
m Tüpflischisser
m Uhung
m Vagant
m Voupfoschte
m Voutotsch
m Weichschnäbeler
f Wixbire
f Wurzle
m Wäbstübeler
m Zablisiech
m Ziegu
m Zirpegigu
m Zwick
m Zwänggring
f Zwätschge
m Zäieföhner
m Zürcher
f auti Hafehuer
m genetische Müuhuufe
m Äschebächer
m Ätti mit Huet
""".trimLines().map { Gendered(it) }
}