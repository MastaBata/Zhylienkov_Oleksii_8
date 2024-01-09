# Zhylienkov_Oleksii_8
Проект `PrecipitationAnalysis` здійснює аналіз даних про кількість опадів на основі інформації, отриманої зовнішнім API. Для цього проекту використовуються Java та бібліотека org.json для роботи з даними у форматі JSON.

## Функціональність проекту

- Клас `PrecipitationAnalysis` реалізує інтерфейс `Runnable` і виконує запит до API метеоданих.
- Отримані дані обробляються у форматі JSON з використанням бібліотеки org.json.
- Для зберігання даних про час та кількість опадів використовується клас `DataEntry`.
- Виконується аналіз даних про кількість опадів для виявлення послідовних днів з опадами.
- Виводяться результати аналізу, включаючи список днів з найбільшою кількістю опадів та виявлення послідовних днів з опадами.

## Технології

- Мова програмування: Java
- Використані бібліотеки: org.json, java.net

## Інструкції щодо запуску

1. Переконайтеся, що встановлено Java Development Kit (JDK).
2. Запустіть проект за допомогою будь-якої IDE або засобу компіляції Java.
3. Після запуску, проект виконає запит до API метеоданих і виведе результати аналізу у консоль.
