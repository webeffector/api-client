API для WebEffector.ru
==========

# Использование API

Для вызова методов API необходимо указывать [токен](http://api.webeffector.ru/doc/index.html#_Токен).
Ниже представлен механизм его получения.

### Получение пользовательского токена
[Документация метода](http://api.webeffector.ru/doc/index.html#_Аутентификация_в_системе)
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
[Документация метода](http://api.webeffector.ru/doc/index.html#_Получение_списка_кампаний)

```java
Campaigns campaignApi = api.campaign();
List<Campaign> campaignes = campaignApi.list();
```

### Получение информации о кампании
[Документация метода](http://api.webeffector.ru/doc/index.html#_Получение_информации_по_кампании)
``` java
Campaign campaign1 = campaignApi.get(campaignes.get(0).getId());
Campaign campaign2 = campaignApi.get("U123456");
```

### Удаление кампании
```java
campaignApi.delete("U123456");
```

## Работа с продвижениями

Для работы с продвижениями необходимо использовать токен.

### Получение подробной информации о продвижении
[Документация метода](http://api.webeffector.ru/doc/index.html#_Получение_информации_по_продвижению)

```java
Promotions promotionApi = api.promotion();
Promotion promotion = promotionApi.get("U123456", "P123");
```