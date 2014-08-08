api-client
==========

Java client for webeffector api

## Использование API

Для вызова методов API необходимо указывать токен.
Ниже представлен механизм его получения.

### Получение пользовательского токена

```java
// создание объекта для работы с API
WebeffectorApi api = WebeffectorApiFactory.create();

// получение объекта для работы с авторизацией
Auth auth = api.auth();

LoginInfo loginInfo = new LoginInfo();
loginInfo.setLogin("username");
loginInfo.setPassword("my_password123");

Token token = auth.token(loginInfo);

// обновление токена
api.updateToken(token.getToken());
```
