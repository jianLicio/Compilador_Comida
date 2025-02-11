import React, { useState } from "react";
import "./index.css";

const CompiladorView = () => {
    const [codigo, setCodigo] = useState("");
    const [resultado, setResultado] = useState("");

    const analisarCodigo = async () => {
        try {
            const response = await fetch("http://localhost:8080/api/compilador/analisar", {
                method: "POST",
                headers: { "Content-Type": "text/plain" },
                body: codigo, // Mantém o formato esperado pela API
            });

            const data = await response.text();
            setResultado(data);
        } catch (error) {
            setResultado("Erro ao conectar com o servidor.");
        }
    };

    return (
        <div className="container">
            <h1>Compilador Comida</h1>
            <div className="editor-container">
                {/* Área de numeração das linhas */}
                <div className="line-numbers">
                    {codigo.split("\n").map((_, i) => (
                        <div key={i} className="line-number">{i + 1}</div>
                    ))}
                </div>

                {/* Caixa de texto do editor */}
                <textarea
                    className="codigo-editor"
                    rows="10"
                    value={codigo}
                    onChange={(e) => setCodigo(e.target.value)}
                    placeholder="Digite o código aqui..."
                    spellCheck={false}
                />
            </div>
            <button onClick={analisarCodigo}>Analisar Código</button>
            <h2>Resultado:</h2>
            <pre>{resultado}</pre>
        </div>
    );
};

export default CompiladorView;
