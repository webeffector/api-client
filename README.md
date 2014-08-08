API для WebEffector.ru
==========

# Использование API

Для вызова методов API необходимо указывать токен.
Ниже представлен механизм его получения.

### Получение пользовательского токена

```java
// создание объекта для работы с API
WebeffectorApi api = WebeffectorApiFactory.create();

// получение объекта для работы с авторизацией
Auth auth = api.auth();

LoginInfo loginInfo = new LoginInfo("username", "my_password123");
Token token = auth.token(loginInfo);

// обновление токена
api.updateToken(token);
```

## Работа с кампаниями

Для работы с кампаниями необходимо использовать токен.

### Получение списка кампаний

```java
Campaigns campaignApi = api.campaign();
List<Campaign> campaignes = campaignApi.list();
```

### Получение информации о кампании
``` java
Campaign campaign1 = campaignApi.get(campaignes.get(0).getId());

// или

Campaign campaign2 = campaignApi.get("U123456");
```

### Удаление кампании
```java
campaignApi.delete("U123456");
```
