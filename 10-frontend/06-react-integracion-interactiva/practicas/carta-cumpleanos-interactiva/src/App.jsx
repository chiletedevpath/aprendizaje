import { useCallback, useEffect, useRef, useState } from "react";
import {
  ArrowLeft,
  ArrowRight,
  ChevronLeft,
  ChevronRight,
  Heart,
  Moon,
  Sun,
  Volume2,
  VolumeX,
  RotateCcw,
  Music2,
  Sparkles
} from "lucide-react";
import { contenido, escenas } from "./data/contenido.js";

const ultimo = escenas.length - 1;

function Flor({ className = "" }) {
  return (
    <svg className={className} viewBox="0 0 280 320" fill="none" aria-hidden="true">
      <path
        d="M127 320c3-56-6-89 26-141 25-42 33-66 23-120"
        stroke="currentColor"
        strokeWidth="2"
        strokeLinecap="round"
      />
      <path
        d="M139 262C86 266 61 238 54 208c44-7 72 10 85 54ZM153 198c40 10 72-3 83-40-42-8-70 11-83 40ZM171 129c-47-6-66-38-64-70 36 6 61 31 64 70Z"
        fill="currentColor"
        fillOpacity=".11"
        stroke="currentColor"
        strokeWidth="1.5"
        strokeLinejoin="round"
      />
      <path
        d="M171 79c-12-3-25-20-20-36 6-17 23-15 30-5 1-21 22-30 35-18 12 11 7 29-2 36 21-1 32 17 24 34-7 15-25 14-35 8-2 23-25 28-37 16-12-11-7-27 5-35Z"
        fill="currentColor"
        fillOpacity=".10"
        stroke="currentColor"
        strokeWidth="2"
      />
      <path
        d="M186 70c-13-10-24-21-31-25m31 25c-3-18-5-33-6-36m6 36 28-37m-28 37 37 14m-37-14-12 38"
        stroke="currentColor"
        strokeWidth="1.4"
      />
      <circle cx="186" cy="70" r="8" fill="currentColor" fillOpacity=".48" />
      <path
        d="M124 295c-30 4-49-4-64-20m103-101c22-1 43-16 52-32"
        stroke="currentColor"
        strokeWidth="1.3"
        strokeLinecap="round"
      />
      <circle cx="66" cy="124" r="3" fill="currentColor" opacity=".45" />
      <circle cx="223" cy="127" r="2.6" fill="currentColor" opacity=".45" />
      <path
        d="M229 239v19m-9-9h19M65 46v13m-6-7h13"
        stroke="currentColor"
        strokeWidth="1.5"
        strokeLinecap="round"
      />
    </svg>
  );
}

function TinyStar({ className = "" }) {
  return (
    <span className={`tiny-star ${className}`} aria-hidden="true">
      ✦
    </span>
  );
}

function Title({ before, accent, className = "" }) {
  return (
    <h1 className={`scene-title ${className}`}>
      {before}
      <br />
      <em>{accent}</em>
    </h1>
  );
}

function SceneLabel({ children }) {
  return (
    <div className="scene-kicker">
      <span className="kicker-line" />
      {children}
      <span className="kicker-line" />
    </div>
  );
}

function Intro({ goNext }) {
  const c = contenido.bienvenida;
  return (
    <section className="scene scene--intro" aria-label="Bienvenida">
      <SceneLabel>{c.subtitulo}</SceneLabel>
      <div className="intro-flower-wrap">
        <Flor className="intro-flower" />
        <TinyStar className="sparkle-one" />
        <TinyStar className="sparkle-two" />
      </div>
      <Title before={c.titulo1} accent={c.titulo2} />
      <p className="scene-description intro-description">{c.mensaje}</p>
      <details className="learning-note" data-no-scene-swipe="true">
        <summary>Chilete DevPath explica esta práctica</summary>
        <p>
          Las escenas son componentes que reciben propiedades. <code>useState</code> conserva la
          escena, el tema y las interacciones; <code>useEffect</code> coordina teclado y audio. Los
          textos se mantienen separados en un módulo para personalizar la experiencia sin tocar la lógica.
        </p>
      </details>
      <button className="primary-button intro-button" onClick={goNext}>
        Abrir mi sorpresa <ArrowRight size={17} />
      </button>
      <div className="intro-whisper">
        Hecho con mucho cariño <span aria-hidden="true">♡</span>
      </div>
    </section>
  );
}

function Celebration({ goNext }) {
  const c = contenido.celebracion;
  return (
    <section className="scene scene--celebration" aria-label="Feliz cumpleaños">
      <SceneLabel>Hoy es tu día</SceneLabel>
      <div className="celestial-sun" aria-hidden="true">
        <span className="sun-inner">✳</span>
        <i className="sun-ray sun-ray--1" />
        <i className="sun-ray sun-ray--2" />
        <i className="sun-ray sun-ray--3" />
      </div>
      <Title before={c.titulo1} accent={c.titulo2} className="celebration-title" />
      {contenido.nombreDestinataria.trim() && (
        <p className="recipient-name">{contenido.nombreDestinataria}</p>
      )}
      <span className="fine-divider" aria-hidden="true" />
      <p className="scene-description">{c.mensaje}</p>
      <button className="secondary-button" onClick={goNext}>
        Preparé algo más <ArrowRight size={16} />
      </button>
    </section>
  );
}

function Gallery() {
  const c = contenido.recuerdos;
  const [photo, setPhoto] = useState(0);
  const startRef = useRef(null);
  const max = c.fotos.length;
  const move = (direction) => setPhoto((p) => (p + direction + max) % max);
  const onTouchStart = (event) => {
    startRef.current = { x: event.changedTouches[0].screenX, y: event.changedTouches[0].screenY };
  };
  const onTouchEnd = (event) => {
    if (!startRef.current) return;
    const dx = event.changedTouches[0].screenX - startRef.current.x;
    const dy = event.changedTouches[0].screenY - startRef.current.y;
    if (Math.abs(dx) > 42 && Math.abs(dx) > Math.abs(dy) * 1.2) move(dx < 0 ? 1 : -1);
    startRef.current = null;
  };
  return (
    <section className="scene scene--gallery" aria-label="Galería de recuerdos">
      <SceneLabel>Momentos que importan</SceneLabel>
      <Title before={c.titulo1} accent={c.titulo2} />
      <p className="scene-description gallery-intro">{c.introduccion}</p>
      <div
        className="gallery-card-area"
        data-no-scene-swipe="true"
        onTouchStart={onTouchStart}
        onTouchEnd={onTouchEnd}
      >
        <div className="gallery-shadow gallery-shadow--one" aria-hidden="true" />
        <div className="gallery-shadow gallery-shadow--two" aria-hidden="true" />
        <article className="polaroid" key={photo}>
          <div className="polaroid-image">
            <img
              src={c.fotos[photo].imagen}
              alt={`Imagen del recuerdo: ${c.fotos[photo].titulo}`}
              draggable="false"
            />
          </div>
          <div className="polaroid-caption">
            {c.fotos[photo].titulo}
            <span className="little-heart">♡</span>
          </div>
        </article>
      </div>
      <div className="gallery-controls" data-no-scene-swipe="true">
        <button className="round-button" onClick={() => move(-1)} aria-label="Fotografía anterior">
          <ChevronLeft size={20} />
        </button>
        <div className="gallery-dots" aria-label={`Fotografía ${photo + 1} de ${max}`}>
          {c.fotos.map((f, i) => (
            <button
              key={i}
              aria-label={`Ver foto ${i + 1}`}
              onClick={() => setPhoto(i)}
              className={i === photo ? "active" : ""}
            />
          ))}
        </div>
        <button className="round-button" onClick={() => move(1)} aria-label="Fotografía siguiente">
          <ChevronRight size={20} />
        </button>
      </div>
      <p className="gallery-caption">{c.fotos[photo].descripcion}</p>
      <div className="small-instruction">Desliza las fotografías para descubrir los recuerdos</div>
    </section>
  );
}

function Details() {
  const c = contenido.detalles;
  const [opened, setOpened] = useState(null);
  return (
    <section className="scene scene--details" aria-label="Cosas que admiro de ti">
      <SceneLabel>Más allá de las palabras</SceneLabel>
      <Title before={c.titulo1} accent={c.titulo2} />
      <p className="scene-description">{c.introduccion}</p>
      <div className="qualities-grid" data-no-scene-swipe="true">
        {c.tarjetas.map((item, i) => (
          <button
            key={item.titulo}
            className={`quality-card ${opened === i ? "quality-card--open" : ""}`}
            onClick={() => setOpened(opened === i ? null : i)}
            aria-expanded={opened === i}
          >
            <span className="quality-number">0{i + 1}</span>
            <span className="quality-icon" aria-hidden="true">
              {["✳", "♡", "✧"][i % 3]}
            </span>
            <span className="quality-title">{item.titulo}</span>
            <span className="quality-note">
              {opened === i ? item.mensaje : "Toca para descubrir un pensamiento"}
            </span>
            <span className="quality-corner" aria-hidden="true">
              {opened === i ? "−" : "+"}
            </span>
          </button>
        ))}
      </div>
    </section>
  );
}

function Cake({ celebrate }) {
  const c = contenido.pastel;
  const [candles, setCandles] = useState([true, true, true]);
  const wished = candles.every((lit) => !lit);
  const wasWished = useRef(false);
  useEffect(() => {
    if (wished && !wasWished.current) {
      wasWished.current = true;
      celebrate();
    }
  }, [wished, celebrate]);
  const putOut = (i) =>
    setCandles((current) => current.map((lit, index) => (index === i ? false : lit)));
  return (
    <section className="scene scene--cake" aria-label="Pastel de cumpleaños interactivo">
      <SceneLabel>Un deseo para guardar</SceneLabel>
      <Title before={c.titulo1} accent={c.titulo2} />
      <p className="scene-description">{c.introduccion}</p>
      <div className="cake-area" data-no-scene-swipe="true">
        <div className="cake-halo" aria-hidden="true" />
        <div className="cake-picture">
          <div className="cake-plate" />
          <div className="cake-bottom">
            <div className="cake-dots">✦ · ✧ · ✦</div>
          </div>
          <div className="cake-top">
            <div className="top-icing">
              <i />
              <i />
              <i />
              <i />
              <i />
            </div>
            <div className="cake-top-detail">♡</div>
          </div>
          <div className="candles">
            {candles.map((lit, i) => (
              <button
                className={`candle candle--${i + 1}`}
                key={i}
                onClick={() => putOut(i)}
                disabled={!lit}
                aria-label={`Apagar vela ${i + 1}`}
                title={`Apagar vela ${i + 1}`}
              >
                <span className={`candle-flame ${lit ? "" : "candle-flame--off"}`} />
                <span className="candle-stick" />
              </button>
            ))}
          </div>
        </div>
        <TinyStar className="cake-star cake-star--one" />
        <TinyStar className="cake-star cake-star--two" />
      </div>
      <div
        className={`wish-result ${wished ? "wish-result--visible" : ""}`}
        role="status"
        aria-live="polite"
      >
        {wished ? (
          <>
            <Heart size={20} fill="currentColor" strokeWidth={1} />
            <p>{c.mensajeFinal}</p>
          </>
        ) : (
          <>
            <Sparkles size={16} />
            <p>Toca las tres llamitas para apagarlas</p>
          </>
        )}
      </div>
      {wished && (
        <button
          className="text-link-button"
          onClick={() => {
            setCandles([true, true, true]);
            wasWished.current = false;
          }}
        >
          <RotateCcw size={14} /> Volver a encender las velitas
        </button>
      )}
    </section>
  );
}

function Letter() {
  const c = contenido.carta;
  const [opened, setOpened] = useState(false);
  return (
    <section
      className={`scene scene--letter ${opened ? "scene--letter-open" : ""}`}
      aria-label="Carta personal"
    >
      <SceneLabel>Escrito especialmente para ti</SceneLabel>
      <Title before={c.titulo1} accent={c.titulo2} />
      {!opened && <p className="scene-description">{c.introduccion}</p>}
      <button
        className={`envelope-control ${opened ? "envelope-control--open" : ""}`}
        onClick={() => setOpened(!opened)}
        aria-label={opened ? "Cerrar el sobre" : "Abrir el sobre"}
        aria-expanded={opened}
        data-no-scene-swipe="true"
      >
        <span className="envelope-note" aria-hidden="true">
          Para alguien
          <br />
          muy especial
        </span>
        <span className="envelope-back" />
        <span className="envelope-flap" />
        <span className="envelope-front" />
        <span className="wax-seal">
          <Heart size={17} fill="currentColor" strokeWidth={1} />
        </span>
      </button>
      {opened ? (
        <article className="letter-paper" data-no-scene-swipe="true">
          <div className="letter-paper-kicker">Desde el corazón</div>
          <h2>{c.saludo}</h2>
          {c.parrafos.map((par, i) => (
            <p key={i}>{par}</p>
          ))}
          <div className="letter-signature">
            {c.despedida}
            <br />
            <span>{contenido.firma}</span>
          </div>
          <div className="paper-flourish">✳</div>
        </article>
      ) : (
        <p className="letter-instruction">
          Toca el sobre para leer tu carta <span aria-hidden="true">♡</span>
        </p>
      )}
      {opened && (
        <button className="text-link-button" onClick={() => setOpened(false)}>
          Guardar la carta en su sobre
        </button>
      )}
    </section>
  );
}

function Final({ restart }) {
  const c = contenido.final;
  return (
    <section className="scene scene--final" aria-label="Mensaje final">
      <SceneLabel>Y antes de terminar...</SceneLabel>
      <div className="final-emblem" aria-hidden="true">
        <span className="final-emblem-inner">
          <Heart size={55} strokeWidth={0.9} />
        </span>
        <TinyStar className="final-star-one" />
        <TinyStar className="final-star-two" />
      </div>
      <Title before={c.titulo1} accent={c.titulo2} />
      <p className="scene-description">{c.mensaje}</p>
      <div className="fine-divider" />
      <p className="final-signature">
        {contenido.firma} <span aria-hidden="true">♡</span>
      </p>
      <span className="final-footnote">{c.pie}</span>
      <button className="secondary-button" onClick={restart}>
        <RotateCcw size={16} /> Volver al comienzo
      </button>
    </section>
  );
}

function Confetti({ count }) {
  if (!count) return null;
  return (
    <div className="confetti-layer" key={count} aria-hidden="true">
      {Array.from({ length: 32 }, (_, i) => {
        const pos = (i * 37 + (i % 4) * 13) % 100;
        const delay = (i % 11) * 0.087;
        const dur = 2.3 + (i % 7) * 0.24;
        return (
          <i
            key={i}
            style={{
              "--pos": `${pos}%`,
              "--delay": `${delay}s`,
              "--duration": `${dur}s`,
              "--rotation": `${i * 47}deg`
            }}
          />
        );
      })}
    </div>
  );
}

export default function App() {
  const [current, setCurrent] = useState(0);
  const [dark, setDark] = useState(false);
  const [playing, setPlaying] = useState(false);
  const [audioError, setAudioError] = useState(false);
  const [confetti, setConfetti] = useState(0);
  const audioRef = useRef(null);
  const stageRef = useRef(null);
  const swipeStartRef = useRef(null);

  const burst = useCallback(() => setConfetti((value) => value + 1), []);
  const goTo = useCallback(
    (target) => {
      const safe = Math.max(0, Math.min(ultimo, target));
      if (safe === 1 && current !== 1) burst();
      setCurrent(safe);
    },
    [burst, current]
  );
  const next = useCallback(() => goTo(current + 1), [goTo, current]);
  const prev = useCallback(() => goTo(current - 1), [goTo, current]);
  const restart = useCallback(() => {
    goTo(0);
  }, [goTo]);

  useEffect(() => {
    if (stageRef.current) stageRef.current.scrollTo({ top: 0, behavior: "instant" });
  }, [current]);
  useEffect(() => {
    const handleKeys = (event) => {
      if (
        event.altKey ||
        event.ctrlKey ||
        event.metaKey ||
        ["INPUT", "TEXTAREA"].includes(document.activeElement?.tagName)
      )
        return;
      if (event.key === "ArrowRight") {
        event.preventDefault();
        next();
      }
      if (event.key === "ArrowLeft") {
        event.preventDefault();
        prev();
      }
    };
    window.addEventListener("keydown", handleKeys);
    return () => window.removeEventListener("keydown", handleKeys);
  }, [next, prev]);
  const toggleMusic = async () => {
    const audio = audioRef.current;
    if (!audio) return;
    if (playing) {
      audio.pause();
      setPlaying(false);
      return;
    }
    try {
      await audio.play();
      setPlaying(true);
      setAudioError(false);
    } catch {
      setAudioError(true);
      setPlaying(false);
    }
  };
  const onTouchStart = (event) => {
    if (event.target.closest("[data-no-scene-swipe], button, a")) return;
    swipeStartRef.current = {
      x: event.changedTouches[0].screenX,
      y: event.changedTouches[0].screenY
    };
  };
  const onTouchEnd = (event) => {
    if (!swipeStartRef.current) return;
    const dx = event.changedTouches[0].screenX - swipeStartRef.current.x;
    const dy = event.changedTouches[0].screenY - swipeStartRef.current.y;
    if (Math.abs(dx) >= 85 && Math.abs(dy) < 65 && Math.abs(dx) > Math.abs(dy) * 1.5)
      goTo(current + (dx < 0 ? 1 : -1));
    swipeStartRef.current = null;
  };
  const sceneNode = [
    <Intro key="intro" goNext={next} />,
    <Celebration key="celebration" goNext={next} />,
    <Gallery key="gallery" />,
    <Details key="details" />,
    <Cake key="cake" celebrate={burst} />,
    <Letter key="letter" />,
    <Final key="final" restart={restart} />
  ][current];

  return (
    <div className={`page-shell ${dark ? "theme-night" : ""}`}>
      <aside className="desktop-context" aria-hidden="true">
        <div className="desktop-context-kicker">Una sorpresa para alguien especial</div>
        <span className="desktop-asterisk">✳</span>
        <p>
          Hay regalos que se guardan en una caja.
          <br />
          <em>Otros, en el corazón.</em>
        </p>
        <span className="desktop-context-bottom">
          Una carta que florece · Edición de cumpleaños
        </span>
      </aside>
      <main className="experience" aria-label="Regalo interactivo de cumpleaños">
        <div className="ambient-grain" aria-hidden="true" />
        <header className="top-bar">
          <div className="brand-mark">
            <span className="brand-heart">♡</span>
            <span>PARA TI</span>
          </div>
          <div className="top-controls">
            <button
              className="icon-button"
              onClick={() => setDark((value) => !value)}
              title={dark ? "Activar modo claro" : "Activar modo noche"}
              aria-label={dark ? "Activar modo claro" : "Activar modo noche"}
            >
              {dark ? <Sun size={17} /> : <Moon size={17} />}
            </button>
            <button
              className={`icon-button ${playing ? "icon-button--playing" : ""}`}
              onClick={toggleMusic}
              title={playing ? "Pausar música" : "Reproducir música"}
              aria-label={playing ? "Pausar música" : "Reproducir música"}
              aria-pressed={playing}
            >
              {playing ? <Volume2 size={18} /> : <VolumeX size={18} />}
            </button>
          </div>
        </header>
        <div className="chapter-nav">
          <span>CAPÍTULO {String(current + 1).padStart(2, "0")}</span>
          <span className="chapter-name">{escenas[current].nombre}</span>
        </div>
        <div className="stage" ref={stageRef} onTouchStart={onTouchStart} onTouchEnd={onTouchEnd}>
          <div className="scenery-decoration scenery-decoration--left" aria-hidden="true">
            ✳
          </div>
          <div className="scenery-decoration scenery-decoration--right" aria-hidden="true">
            ✧
          </div>
          <div className="scene-transition" key={escenas[current].id}>
            {sceneNode}
          </div>
        </div>
        <Confetti count={confetti} />
        <footer className="experience-footer">
          {audioError && (
            <div className="audio-note" role="status">
              No se pudo reproducir la música en este dispositivo.
            </div>
          )}
          <div className="progress-row">
            <span className="progress-caption">UN REGALO PARA TI</span>
            <span className="progress-numbers">
              {String(current + 1).padStart(2, "0")} / {String(escenas.length).padStart(2, "0")}
            </span>
          </div>
          <div
            className="progress-track"
            role="progressbar"
            aria-label="Avance de la sorpresa"
            aria-valuemin={1}
            aria-valuemax={escenas.length}
            aria-valuenow={current + 1}
          >
            <span style={{ width: `${((current + 1) / escenas.length) * 100}%` }} />
          </div>
          <div className="navigation-row">
            <button
              className="nav-back"
              onClick={prev}
              disabled={current === 0}
              aria-label="Escena anterior"
            >
              <ArrowLeft size={21} />
            </button>
            <div className="nav-dots" role="group" aria-label="Navegar por las escenas">
              {escenas.map((item, i) => (
                <button
                  key={item.id}
                  className={i === current ? "nav-dot nav-dot--active" : "nav-dot"}
                  onClick={() => goTo(i)}
                  aria-label={`Ir a ${item.nombre}`}
                  aria-current={i === current ? "step" : undefined}
                />
              ))}
            </div>
            <button className="nav-next" onClick={current === ultimo ? restart : next}>
              {current === ultimo ? (
                <>
                  Repetir <RotateCcw size={16} />
                </>
              ) : (
                <>
                  {current === 0 ? "Comenzar" : "Continuar"} <ArrowRight size={17} />
                </>
              )}
            </button>
          </div>
          <span className="chilete-credit">Práctica educativa · Chilete DevPath</span>
        </footer>
        <audio
          ref={audioRef}
          src={contenido.musica.archivo}
          loop
          preload="none"
          onPause={() => setPlaying(false)}
          onPlay={() => setPlaying(true)}
          onError={() => setAudioError(true)}
        />
      </main>
      <aside className="desktop-quote" aria-hidden="true">
        <span>✦</span>
        <p>Los pequeños detalles también pueden convertirse en grandes recuerdos.</p>
        <i>Con todo el cariño del mundo.</i>
      </aside>
    </div>
  );
}
