import Card from "./components/card";
import Topo from "./components/Topo";
export default function Home() {

  return (
    <main>
      <Topo></Topo>
      <div style={testecss}></div>
      <div className='flex sm:grid sm:grid-cols-4 justify-center gap-3n p-4'>
    </div>
    </main>
  );
}

const testecss = {

  display: 'flex',
  justify: 'center',
  alignItens: 'center',
  color: '#00f',
  background: '#eee',
  fontSize: '20px'

}

