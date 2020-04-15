# Przykładowa aplikacja pokazująca budowanie modularnego monolitu.

Celem aplikacji jest pokazanie sposobu budowania modularnego monolitu. Składa się ona z 2 autonomicznych modułów biznesowych - customer i notification. 

## Moduły

#### 1. gateway

Decyduje który z modułów w danym momencie należy uruchomić.

#### 2. base

Zawiera współdzielone fragmenty kodu. Posiada podział na external - kod udostępniany innym modułom i internal - kod prywatny.

#### 3. moduleCustomer

Wystawia API przyjmujące email klienta. Następnie zapisuje tą informacje w bazie oraz wysyła event informujący o tym zdarzeniu.

#### 4. moduleNotification

Odbiera event zarejestrowania klienta i przygotowywuje treść email ofertowego. Wysyłka również odbywa się poprzez szynę zdarzeń.

#### Testowanie:

W celu zobaczenia jak aplikacja działa należy:

1. Uruchomić aplikacje lokalnie
2. Wykonać zapytanie POST np. z postmana na adres 
    http://localhost:8090/customer z body "test@serwer.pl"

Co się powinno zadziać?

1. W logach powinniśmy zobaczyć Email send, data: EmailEvent{email='"test@serwer.pl"', message='calcualted message for customer'}
2. W http://localhost:8090/h2-console w tabeli USER_ENTITY powinien byc wpis "test@serwer.pl"