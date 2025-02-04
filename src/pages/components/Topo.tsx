import Link from "next/link"
import Card from "./card"

export default function Topo() {
    return (
        <div className='flex justify-between items-center bg-slate-400 h-[250PX]'>
            <main className='text-5xl'>LOGO</main>
            <main>
                <main className='text-4xl'>SUIPCursos</main>
                <main className='subtitulotopo'>Curso de React next js</main>
                <main>Basico-Avancado</main>
                <main style={{ color: 'red', backgroundColor: '#bbb' }}>Nivel; I, II, III, IV E V</main>
            </main>
            <main>
                <main className='text-left'>Igor Tobias Pumbe</main>
                <main className='text-left'>NIVEL: I</main>
                <main className='text-left'>Horario: 09:00-17:00</main>
                <main className='text-left'>Dias de Semana: Segunda-Sabado</main>
                <main className='text-left'>StatusDoAluno: Excelente</main>
                <div className='text-left'>Nivel: I</div>
                <main className='text-left'>Universidade: Eduardo Mondlane</main>
                <div className='text-left'>Curso: Engenharia Informatica</div>
                <div className='text-left'>Faculdade: 2o ano</div>
                <div className='text-left'>Estagiario na NetLine: 3 meses</div>
            </main>
            <nav className='flex flex-col justify-between items-center bg-cyan-200'>
                <Link href={"/styles/globals"}>
                Produtos
                </Link>
                <Link href={"/teste/teste"}>
                Teste
                </Link>
                <Link href={"/produtos/produtos"}>
                Home
                </Link>
                <Link href={"/teste/index"}>
                Init
                </Link>
            </nav>
        </div>
    )
}