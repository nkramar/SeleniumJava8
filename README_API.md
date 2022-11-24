<h1 align="left">
 <a name="Сфера">Шаблонный проект по тестированию API для платформы "СФЕРА"  </a> <img src="images/SFERA.png" width="35" height="30" alt="Сфера"/> 
</h1> 

<a name="наверх"></a>

# <a name="Описание">Содержание</a>

+ [Технологии и инструменты](#Technology)
+ [Краткое описание технологий и инструментов](#TechnologyDescription)
+ [Примеры автоматизированных тест кейсов](#TestCases)
+ [Тэги для запуска автотестов](#Tags)
+ [Пример отчёта о результатах тестирования в Allure](#AllureReport)
+ [Запуск в TeamCity](#TeamCity)

<h1 align="left">
<a name="Technology">Технологии и инструменты</a>
</h1>

<p align="left">  
<a href="https://www.jetbrains.com/idea/"><img src="images/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>  
<a href="https://www.java.com/"><img src="images/Java.svg" width="50" height="50"  alt="Java"/></a>  
<a href="https://junit.org/junit5/"><img src="images/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>  
<a href="https://commons.wikimedia.org/wiki/File:Bitbucket-Logo-blue.svg"><img src="images/bitbucket-official.svg" width="90" height="50"  alt="Github"/></a>
<a href="https://gradle.org/"><img src="images/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/Allure_Report.svg" width="50" height="50"  alt="Allure"/></a> 
<a href="https://avatars.githubusercontent.com/u/19369327?s=200&v=4"><img src="images/Rest-Assured.svg" width="50" height="50"  alt="Rest-Assured"/></a>  
<a href="https://avatars.githubusercontent.com/u/45949248?s=200&v=4"><img src="images/Lombok.png" width="50" height="50"  alt="Lombok"/></a>
<a href="https://worldvectorlogo.com/logo/teamcity-icon"><img src="images/teamcity-icon.svg" width="50" height="50"  alt="Teamcity"/></a>  
</p>

# <a name="TechnologyDescription">Краткое описание технологий и инструментов</a>

:question: *Что и для чего мы используем в нашем шаблонном проекте:*

- Библиотеку [Owner](http://owner.aeonbits.org/docs/features) для лёгкой и гибкой конфигурации автотестов через
  Properties
- Библиотеку [Lombok](https://auth0.com/blog/a-complete-guide-to-lombok/) для сокращения шаблонного кода
- Библиотеку [Jackson](https://www.baeldung.com/jackson/)  для сериализации и десериализации объектов
- Библиотеку [Rest Assured](https://github.com/rest-assured/rest-assured/wiki/Usage) для тестирования REST API с
  использованием библиотек Java
- Библиотеку [Pebble Templates](https://pebbletemplates.io/)  для шаблонов с переменными, в которые в дальнейшем
  подставляются нужные данные
- Framework [JUnit5](https://junit.org/junit5/docs/current/user-guide/) для написания и выполнения автотестов с
  использованием аннотаций
- Библиотеку [AssertJ](https://assertj.github.io/doc/#assertj-core-custom-assertions) для осуществления кастомных проверок в тестах 
- Инструмент для сборки [Gradle](https://docs.gradle.org/current/userguide/what_is_gradle.html)
- Ииструмент [Allure Report](https://docs.qameta.io/allure/) для визуализации результатов тестирования 
- Класс `Custom Allure Listener` для красивой отрисовки логирования API запросов/ответов
- Инструмент CI/CD  [TeamCity](https://www.jetbrains.com/help/teamcity/teamcity-documentation.html) для удаленного запуска автотестов
- Инструмент [Bitbucket](https://bitbucket.org/product/guides) для хостинга кода и совместной работы, основанный на системе контроля версий Git
  
<h1 align="left">
<a name="TestCases"><i>Примеры автоматизированных тест кейсов</i></a>
</h1>

- :white_check_mark: Пример теста с использованием подхода с файлами и подменой данных в них
- :white_check_mark: Пример теста с использованием подхода с data классами
- :white_check_mark: Пример теста с использованием подхода c map

# <a name="Tags">Тэги для запуска авто тестов</a>

>-  `tests` для запуска всех автотестов
>-  `runApiTests` для запуска API автотестов
>-  `runSmokeApiTests` для запуска Smoke API автотестов
>-  `runParallelApiTests` для параллельного запуска API автотестов


<h1 align="left">
<img src="images/Allure_Report.svg" width="25" height="25" alt="Allure_Report"/>  <a name="AllureReport">Пример отчёта о результатах тестирования в Allure </a>
</h1>


<p align="center">  
<img title="Allure Report" src="images/Allure Report Example.png">  
</p>  

<h1 align="left">
<img src="images/teamcity-icon.svg" width="25" height="25" alt="TeamCity"/>  <a name="TeamCity">Запуск автотестов в TeamCity </a>
</h1>


[Наверх ⬆](#наверх)


