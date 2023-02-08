# Domaci23

Kreirati maven projekat, u test/java folderu napraviti dva paketa:
pages
tests

Testira se sajt sajt: https://www.saucedemo.com/

Napraviti Page za Login, Inventory i Sidebar (u njemu se nalazi Logout dugme).

Testirati Login za prva tri usera (standard_user, locked_out_user, problem_user). Za drugog i treceg samo proveriti da li se pojavljuje poruka da se nije uspesno ulogovao. Pogledati ispod edit

Za prvog usera, na Inventory testirati dodavanje u cart i da li se pojavljuje u cart-u u gornjem desnom uglu broj. Takodje testirati kada se klikne remove da u cart-u pise 0 se ne pojavljuje span sa brojem.

Testirati logout dugme, da li vas na klik vrati na originalni url i kada odete sa driver.get na https://www.saucedemo.com/inventory.html da li pise poruka: “Epic sadface: You can only access '/inventory.html' when you are logged in.”

Koristiti apstrakciju i nasledjivanje za zajednicke stvari za testove i za stranice.



Update za jedan deo, mada ko je uradio drugacije ne mora da se cima. Mislio sam da drugi i treci user ne mogu da se uloguju, ali sam ja omasio password, tako da bi zapravo bilo:

Testirati Login za prva dva usera (standard_user, locked_out_user). Za drugog da li se pojavljuje poruka da se nije uspesno ulogovao. Istu proveru uraditi kada se unese pogresan password za standard_user.
