interface CardProps {
    produto: String,
    valor: number,
    desconto: number

}





export default function Card(props: CardProps) {
    return (
        <div className="flex flex-col border border-y-pink-800 rounded-sm p-4">
            <div>Produto:{props.produto}</div>
            <div>Valor:{props.valor}Mzn</div>
            {props.desconto>0? (
                <div> 
                    <div>desconto:{props.desconto}Mzn</div>
                    <div>Preco de Venda:{props.valor - props.desconto}Mzn</div>
                </div>
            ):<div>Sem Desconto</div>}
        </div>
    )

}