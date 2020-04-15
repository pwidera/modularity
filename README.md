W celu przetestowania:

1. Uruchamiamy aplikacje lokalnie
2. Wykonujemy zapytanie POST np. z postmana na adres 
    http://localhost:8090/customer z body "test@serwer.pl"

Co sie powinno zadziać?

1. W logach powinniśmy zobaczyć Email send, data: EmailEvent{email='"test@serwer.pl"', message='calcualted message for customer'}
2. W http://localhost:8090/h2-console w tabeli USER_ENTITY powinien byc wpis "test@serwer.pl"