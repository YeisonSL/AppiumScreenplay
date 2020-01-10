Automatización de Pruebas Nequi APP Colombia

Descripción y contexto

Nequi es una aplicación para manejar la plata desde el celular de forma fácil y en momentos cotidianos.

Mantras en Nequi

Cotidiano:
Nequi acompaña a las personas día a día en su bolsillo con una oferta
relevante en su vida cotidiana. Una oferta sencilla pero que querrán
usar todos los días.

Flexible:
Nequi no viene con reglas ni instrucciones de uso, cualquiera puede usar Nequi como quiera. Además, ante cualquier imprevisto Nequi siempre estará ahí para plantear alternativas.

Responsable:
Todos los servicios de Nequi pretenden ayudar a las personas a organizarse mejor con herramientas más simples.

Sin ataduras:
Todos los servicios de Nequi son sin compromiso, se pueden agregar o quitar servicios según se necesitan.


Resumen de codificación


El framework

Screenplay (The Journey Patter o patrón de viaje)
Fomenta los buenos hábitos de prueba y los conjuntos de pruebas bien diseñados que son fáciles de leer, fáciles de mantener y fáciles de extender, lo que permite a los equipos escribir pruebas automatizadas más sólidas y confiables de manera más efectiva.

Gherkin
El lenguaje Gherkin define la estructura y una sintaxis básica para la descripción de las pruebas que pueden ser entendidas tanto por los integrantes técnicos del equipo como así también por los Analistas/PO o quien quiera que este como representante del cliente. De esta manera mientras se generan pruebas se esta generando documentación viva que describe perfectamente como se comporta el sistema enriqueciendo y manteniendo la documentación

Feature: Indica el nombre de la funcionalidad que vamos a probar. Debe ser un título claro y explícito. Incluimos aquí una descripción en forma de historia de usuario: “Como [rol] quiero [característica] para que [los beneficios]”. Sobre esta descripción empezaremos a construir nuestros escenarios de prueba.
Scenario: Describe cada escenario que vamos a probar.
Given: Provee contexto para el escenario en que se va a ejecutar el test, tales como punto donde se ejecuta el test, o prerequisitos en los datos. Incluye los pasos necesarios para poner al sistema en el estado que se desea probar.
When: Especifica el conjunto de acciones que lanzan el test. La interacción del usuario que acciona la funcionalidad que deseamos testear.
Then: Especifica el resultado esperado en el test. Observamos los cambios en el sistema y vemos si son los deseados. Lo normal es probar distintos escenarios para comprobar una determinada funcionalidad. De esta forma vamos a pasar de nuestras historias de usuario a pruebas de comportamiento automatizables.

Cucumber
Cucumber nos va permitir ejecutar descripciones funcionales en texto plano como pruebas de software automatizadas siendo intermediador entre el lenguaje natural y lenguaje máquina. Totalmente compatible con el lenguaje Gherkin.

Compilador: Gradle

Prácticas de automatización
Un proyecto donde se ejemplifica el uso del patrón serenity screenplay  con cucumber, gradle y java

Estrategia de automatización de pruebas de aceptación:
Se planteó automatizar el desatraso de los flujos críticos de negocio como apoyo en la regresión para las constantes salidas a producción.

El backend Finacle se encuentra en infraestructura de Bancolombia y los demás componentes son administrados con Pragma en servicios de AWS
a continuación enlace a esquema de arquitectura Nequi
 (https://grupobancolombia.visualstudio.com/b267af7c-3233-4ad1-97b3-91083943100d/_apis/git/repositories/1b927269-b4fe-422e-bbb7-6c60f64a9938/Items?path=%2F.attachments%2FArquitectura%20general%20NEQUI-34b6c5fe-d04d-4443-bf79-aa300d6fd11a.pptx&download=false&resolveLfs=true&%24format=octetStream&api-version=5.0-preview.1)


Requerimientos
Para correr el proyecto se necesita Java JDK 1.8 y Gradle preferiblemente con la versión 4.8.1

Para correr el proyecto
Ubicarse en la carpeta del proyecto en una consola y ejecutar el comando:

        gradle clean test aggregate

La evidencia generada por la ejecución podrá ser consultada en la carpeta target haciendo búsqueda del archivo index.html
# AppiumScreenplay
