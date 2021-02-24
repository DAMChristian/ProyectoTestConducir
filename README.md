# Test de conducir

_Test de conducir_

## Descripcion 🚀
Programa que te permite generar test sacando las preguntas de un archivo con formato JSON.
    -Mediante el paquete fasterxml.jackson transformo un array JSON a mi clase Pregunta.

Se ha optado por un diseño oscuro.

Permite retroceder y avanzar en las preguntas del test y guarda su valor.
    -Se opto por generar un array de paneles los cuales se muestran y ocultan para mantener la seleccion actual de la respuesta.

Boton finalizar el cual te permite ver cuantos aciertos llevas y permite cargar otro test.

El numero máximo de preguntas viene dado por el contenido del archivo JSON

## Generar tu propio test 📋
    Se tiene que crear un archivo JSON con el siguiente formato.
        [{
            "enunciado":"¿De qué previene la señal vertical de visibilidad reducida?",
            "pregunta1":"Zona escolar con niños cruzando la vía",
            "pregunta2":"Curva demasiado pronunciada",
            "pregunta3":"Fenómenos meteorológicos como la niebla",
            "pregunta4":"Tienes la luna manchada",
            "preguntaCorrecta":"Fenómenos meteorológicos como la niebla"
        },{
            "enunciado":"¿Deberán los conductores de taxi llevar el cinturón de seguridad en autopista?",
            "pregunta1":"No, no será necesario para ellos",
            "pregunta2":"Únicamente deberán llevarlo cuando transporten pasajeros",
            "pregunta3":"Sí, siempre",
            "pregunta4":"No, no son personas",
            "preguntaCorrecta":"Sí, siempre"
        }]
    
    -  Se repite el contenido que esta entre llaves {}.
    -  Empieza y termina por []
    -  Cada contenido entre {} se separa por ,.
    -  PreguntaCorrecta se pone el mismo texto que la pregunta que corresponda.

## Requisitos 📋
La aplicación ha de ofrecer al usuario una forma de elegir unconjuntode preguntasposibles, que puede ser un archivo en formato JSON o similaro una base de datos SQLite(u otra forma que el alumno elija), que sea posible distribuir con la aplicación y que sea fácilmenteeditable para añadir preguntas.Una vez elegida la base de datos, la aplicación permite al usuario comenzar el examen.
Las preguntas del examenhan de ser elegidas al azar de entre elconjunto de preguntas posibles, y las posibles respuestas de cada pregunta se mostrarán al usuario en ordenaleatorio, de modo que no pueda aprender de memoria la posición correcta de cada respuesta.Al finalizar el examen, la aplicación muestra al usuario los resultados del mismo (preguntas acertadas, porcentaje de aciertos, aprobado/suspenso, etc.) y permite al usuario volver al inicio (porejemplo, a la pantalla de iniciar examen). La aplicación se empaquetará según veamos en clase, y se preparará un instalador para su distribución.
    - La fecha de entrega de esta práctica se adelanta al día 25 de febrero a las 7:00 de la mañana
    - A causa de este adelanto, suprimimos los requisitos de añadir documentación con JavaHelp y de crear un instalador para la aplicación. Se podrán incluir estos posteriormente si el alumno lo desea, y se valorarán como trabajo para subir nota
    - La recuperación consistirá en repetir las prácticas suspensas o no entregadas, con los requisitos que se indiquen en clase
    - El día 3 de marzo se reserva para el exámen final, en caso de que alguien no haya superado la asignatura mediante la evaluación contínua y la recuperación de las prácticas

## Autores ✒️

* **Christian Villanueva** - [DAMChrisitian](https://github.com/DAMChristian)
