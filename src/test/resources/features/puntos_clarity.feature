#language:es

Característica: Automatizar validacion de puntos en Clarity

  Esquema del escenario: ver puntos disponibles en clarity
    Dado que me encuentro en la paguina de clarity inicio sesion <email>, <contrasena>
    Cuando voy a estado de canjes para validar mis puntos
    Entonces veo el mensaje de 'Monedas Acumuladas'
    Ejemplos:
      | email                   | contrasena |
      | celene.parra@quipux.com | *******    |