// Personaliza únicamente los valores de este archivo.
// Deja nombreDestinataria vacío si prefieres no mostrar un nombre.
export const contenido = {
  nombreDestinataria: '',
  firma: 'Con mucho cariño',
  bienvenida: {
    subtitulo: 'Una pequeña sorpresa para ti',
    titulo1: 'Para alguien',
    titulo2: 'inolvidable.',
    mensaje: 'Hay días que merecen algo más que un mensaje. Preparé este pequeño detalle pensando en ti.',
  },
  celebracion: {
    titulo1: 'Feliz',
    titulo2: 'cumpleaños.',
    mensaje: 'Que hoy tengas mil razones para sonreír y que este nuevo año esté lleno de momentos hermosos.',
  },
  recuerdos: {
    titulo1: 'Instantes que',
    titulo2: 'se quedan.',
    introduccion: 'Algunos momentos, por sencillos que sean, merecen un lugar especial.',
    fotos: [
      { imagen: '/images/recuerdos/recuerdo-1.svg', titulo: 'Un día para recordar', descripcion: 'Aquí puedes escribir qué hizo especial este momento.' },
      { imagen: '/images/recuerdos/recuerdo-2.svg', titulo: 'Una sonrisa', descripcion: 'Aquí puedes contar un recuerdo bonito que compartieron.' },
      { imagen: '/images/recuerdos/recuerdo-3.svg', titulo: 'De esos instantes', descripcion: 'Aquí puedes escribir una anécdota que les haga sonreír.' },
      { imagen: '/images/recuerdos/recuerdo-4.svg', titulo: 'Un pequeño recuerdo', descripcion: 'Aquí puedes dedicar unas palabras a esta fotografía.' },
    ],
  },
  detalles: {
    titulo1: 'Cosas que',
    titulo2: 'admiro de ti.',
    introduccion: 'No siempre encuentro las palabras exactas, pero hay detalles tuyos que valoro mucho.',
    tarjetas: [
      { titulo: 'Tu sonrisa', mensaje: 'Esa manera tan tuya de hacer que cualquier momento parezca más bonito.' },
      { titulo: 'Tu forma de ser', mensaje: 'La autenticidad y la luz que transmites, incluso sin darte cuenta.' },
      { titulo: 'Los momentos contigo', mensaje: 'Porque incluso las cosas más simples se vuelven recuerdos especiales.' },
    ],
  },
  pastel: {
    titulo1: 'Pide un',
    titulo2: 'deseo.',
    introduccion: 'Cierra los ojos por un instante. Piensa en algo que de verdad quieras y apaga las velitas.',
    mensajeFinal: 'Ojalá todo lo bonito que sueñas encuentre la forma de hacerse realidad.',
  },
  carta: {
    titulo1: 'Una carta',
    titulo2: 'para ti.',
    introduccion: 'Hay palabras que merecen su propio lugar. Esta es una de esas veces.',
    saludo: 'Para ti,',
    parrafos: [
      'Hoy quería hacer algo distinto para recordarte lo especial que eres. No es un regalo enorme, pero está hecho con toda la intención de sacarte una sonrisa.',
      'Me alegra haber coincidido contigo. Hay personas que, sin proponérselo, hacen los días un poquito mejores; tú eres una de ellas.',
      'Deseo que la vida te sorprenda con momentos hermosos, personas que te cuiden de verdad y motivos para sentirte orgullosa de todo lo que eres y estás construyendo.',
      'Gracias por ser tú. Que nunca te falten sueños, tranquilidad y razones para sonreír. Feliz cumpleaños.',
    ],
    despedida: 'Con mucho cariño,',
  },
  final: {
    titulo1: 'Nunca dejes',
    titulo2: 'de sonreír.',
    mensaje: 'Ojalá este nuevo año de vida te regale momentos tan bonitos como los que mereces.',
    pie: 'Este pequeño rincón siempre será para ti.',
  },
  musica: {
    archivo: '/audio/melodia-original.mp3',
    etiqueta: 'Melodía suave',
  },
}

export const escenas = [
  { id: 'bienvenida', nombre: 'La sorpresa' },
  { id: 'celebracion', nombre: 'Tu cumpleaños' },
  { id: 'recuerdos', nombre: 'Recuerdos' },
  { id: 'detalles', nombre: 'Lo que admiro' },
  { id: 'pastel', nombre: 'Pide un deseo' },
  { id: 'carta', nombre: 'Una carta' },
  { id: 'final', nombre: 'Hasta pronto' },
]
