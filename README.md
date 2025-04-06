# 🧪 Centicore UI Automated Tests

Автоматизированные UI тесты для сайта [Centicore](https://centicore.ru), реализованные с использованием **Selenide**, **JUnit 5**, **Gradle** и **Allure**. Проект построен по принципу **Page Object**, что обеспечивает масштабируемость и читаемость автотестов.

---

## 🔧 Стек технологий

| Инструмент        | Назначение                          |
|-------------------|-------------------------------------|
| Java 11+          | Язык программирования               |
| Gradle            | Система сборки                      |
| Selenide          | UI-фреймворк для браузерного тестирования       |
| JUnit 5           | Тестовый фреймворк                  |
| Allure            | Отчёты о тестах                |
| Selenoid (optional) | Запуск в Docker-контейнерах        |

---

## 📁 Структура проекта

- `centicore-ui-tests/`  
  ├─ `build.gradle` — Gradle билд-файл с зависимостями  
  ├─ `gradlew / gradlew.bat` — Gradle wrapper для Windows/Linux/Mac  
  ├─ `README.md` — Этот файл  
  └─ `src/`  
  &nbsp;&nbsp;&nbsp;&nbsp;├─ `main/java/pages/` — Page Object'ы (HomePage, ProductsPage, CareerPage, etc.)  
  &nbsp;&nbsp;&nbsp;&nbsp;└─ `test/java/tests/` — Тесты (CenticoreTests, TestBase)  

---

## 🚀 Запуск проекта

### 📌 Предусловия

- Java 11+
- Gradle (или `./gradlew`)
- Chrome + WebDriver (если запуск локально)
- Selenoid (если запуск в контейнере)

### 🔄 Сборка и зависимости

```bash
./gradlew clean build
```

### ▶️ Запуск тестов

```bash
./gradlew test
```

Запуск с Selenoid:

```bash
./gradlew clean test -DremoteUrl=http://localhost:4444/wd/hub
```

---

## 📊 Allure отчеты

### Генерация отчёта

```bash
./gradlew allureReport
```

### Открытие в браузере

```bash
./gradlew allureServe
```

---

## ✅ Покрытие тестами

Реализовано 10 автотестов, в т.ч.:

- Навигация на Products, Career, Contacts
- Проверка футера
- Проверка содержимого главной страницы
- Отображение вакансий
- Общая проверка открытия сайта

---

## 📃 Лицензия

Проект создан в рамках курса **QA.Guru** и предназначен для обучения. Свободно распространяется.
