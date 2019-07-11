# eCensus
Softverski sistem “eCensus” se sastoji od tri klijentske i dvije serverske aplikacije. 

## Aplikacija za administratore 
Aplikacija za administratore služi izvršiocima popisa da definišu sve potrebne parametre prije početka popisa, uključujuci i sve naloge koji će biti korišteni. Tokom popisa ova aplikacija omogućava administratorima potpunu kontrolu procesa popisivanja. Potpuna kontrola podrazumijeva da administrator u svakom trenutku može da pogleda aktivnosti svakog popisivača od početka popisa do tog trenutka i da pregleda statističke podatke koji su izračunati do tog trenutka. Podatke o aktivnostima popisivača obezbjeđuje CMIS server, dok statističke podatke obezbjeđuje glavni server.
## Aplikacija za popisivače 
Aplikacija za popisivače predstavlja najvažniju klijentsku aplikaciju. Ovaj dio sistema omogućava popisivačima popunjavanje popisnica i njihovo slanje na server. 
## Aplikacija za programere 
Aplikacija za programere je pomoćna aplikacija koja služi za dodavanje naloga administratora iz Agencije ili entitetskih zavoda za statistiku, jer su administratori tog tipa na vrhu hijerarhije izvršilaca popisa. Može je koristiti neko iz razvojnog tima ili neka druga osoba od povjerenja.
## Prva serverska aplikacija 
Prva serverska aplikacija je glavni server na kome se čuva baza podataka sa podacima o svim popisanim stanovnicima i stanovima, odnosno domaćinstvima. Ovaj server je aktivan tokom cijelog procesa popisivanja i prihvata sve podatke koje šalju popisivači. Nakon što prihvati nove podatke, server ažurira statističke podatke, tako da su podaci ažurirani u svakom trenutku. Osim skladištenja podataka koje primi, server može generisati izvještaj o trenutnim statističkim podacima i poslati klijentskoj aplikaciji koja je zahtjevala izvještaj.
## Druga serverska aplikacija 
Drugu serversku aplikaciju čini CMIS (Control Management Information System) server. Ovaj server skladišti podatke o nalozima svih učesnika u popisu i podatke o aktivnostima svih popisivača. Aktivnosti popisivača se bilježe radi kontrole popisivača i cijelog procesa popisa od strane administratora.
