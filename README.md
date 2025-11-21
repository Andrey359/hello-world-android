# Hello World Android

Простое Android приложение "Hello World" на Kotlin.

## Характеристики

- **Язык программирования**: Kotlin
- **Минимальная версия Android**: 7.0 (API 24)
- **Целевая версия Android**: 14 (API 34)
- **Build System**: Gradle with Kotlin DSL

## Функциональность

- Отображение приветственного текста
- Кнопка с счётчиком нажатий
- Интерактивная смена текста приветствия
- Material Design компоненты

## Как запустить

1. Клонируйте репозиторий
2. Откройте проект в Android Studio
3. Дождитесь синхронизации Gradle
4. Подключите Android устройство или запустите эмулятор
5. Нажмите Run (▶️)

## Требования

- Android Studio Arctic Fox или новее
- Android SDK 34
- Gradle 8.0+
- JDK 8 или новее

## Структура проекта

```
app/
├── src/main/
│   ├── kotlin/com/example/helloworld/
│   │   └── MainActivity.kt
│   ├── res/
│   │   ├── layout/
│   │   │   └── activity_main.xml
│   │   ├── values/
│   │   │   ├── strings.xml
│   │   │   ├── colors.xml
│   │   │   └── themes.xml
│   │   └── mipmap/ (иконки приложения)
│   └── AndroidManifest.xml
└── build.gradle.kts
```

## Лицензия

MIT License