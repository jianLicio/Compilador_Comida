import React, { useState } from "react";

const CompiladorView = () => {
    const [codigo, setCodigo] = useState("");
    const [resultado, setResultado] = useState("");

    const analisarCodigo = async () => {
        try {
            const response = await fetch("http://localhost:8080/api/compilador/analisar", {
                method: "POST",
                headers: { "Content-Type": "text/plain" },
                body: codigo
            });

            const data = await response.text();
            setResultado(data);
        } catch (error) {
            setResultado("Erro ao conectar com o servidor.");
        }
    };

    return (
        <div>
            <h1>Compilador Comida</h1>
            <textarea
                rows="10"
                cols="50"
                value={codigo}
                onChange={(e) => setCodigo(e.target.value)}
                placeholder="Digite o código aqui..."
            />
            <br />
            <button onClick={analisarCodigo}>Analisar Código</button>
            <h2>Resultado:</h2>
            <pre>{resultado}</pre>
        </div>
    );
};

export default CompiladorView;
