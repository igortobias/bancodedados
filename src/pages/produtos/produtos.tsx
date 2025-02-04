import Topo from "../components/Topo"
import Card from "../components/card"
const produtos = [
    {
        produto: 'Tws pro lite',
        valor: 500,
        desconto: 50,
        disponivel: true
    },
    {
        produto: 'Pro 2',
        valor: 500,
        desconto: 150,
        disponivel: true
    },
    {
        produto: 'Wicked 60ml',
        valor: 500,
        desconto: 499,
        disponivel: true
    },
    {
        produto: 'Hudson 80ml',
        valor: 800,
        desconto: 89,
        disponivel: true
    },
    {
        produto: 'Di 60ml',
        valor: 500,
        desconto: 450,
        disponivel: true
    },
]


export default function produtosPagina() {
    return (
        <div> {
            produtos.map((e: any) => {
                if (e.disponivel) {
                    return (
                        <Card
                            produto={e.produto}
                            valor={e.valor}
                            desconto={e.desconto} />
                    )
                }
            })}</div>)
}

