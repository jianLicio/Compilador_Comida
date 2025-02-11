import React, { useState, useEffect, useRef } from "react";
import axios from "axios";
import { FaFolderOpen, FaUtensilSpoon } from "react-icons/fa"; // Ícones do Font Awesome
import "./index.css";

export default function CompiladorView() {
    const [codigo, setCodigo] = useState("");
    const [resultado, setResultado] = useState("");
    const [linhas, setLinhas] = useState(["1"]);
    const textareaRef = useRef(null);

    useEffect(() => {
        const totalLinhas = codigo.split("\n").length;
        setLinhas(Array.from({ length: totalLinhas }, (_, i) => i + 1));
    }, [codigo]);

    useEffect(() => {
        if (textareaRef.current) {
            textareaRef.current.style.height = "auto";
            textareaRef.current.style.height = textareaRef.current.scrollHeight + "px";
        }
    }, [codigo]);

    const carregarArquivo = (event) => {
        const file = event.target.files[0];
        if (file) {
            const reader = new FileReader();
            reader.onload = (e) => {
                setCodigo(e.target.result);
            };
            reader.readAsText(file);
        }
    };

    const analisarCodigo = async () => {
        try {
            const response = await axios.post("http://localhost:8080/api/compilador/analisar", codigo, {
                headers: { "Content-Type": "text/plain" },
            });
            setResultado(response.data);
        } catch (error) {
            setResultado(error.response?.data || "Erro ao analisar código.");
        }
    };

    return (
        <div className="container">
            <h1 className="titulo">Compilador Comida</h1>

            {/* Botões de ação */}
            <div className="botoes-container">
                <label className="botao botao-procurar">
                    <FaFolderOpen className="icone" />
                    Abrir Tampa
                    <input type="file" accept=".txt" onChange={carregarArquivo} hidden />
                </label>
                <button className="botao botao-cozinhar" onClick={analisarCodigo}>
                    <FaUtensilSpoon className="icone" />
                    Cozinhar
                </button>
            </div>

            {/* Editor de código */}
            <div className="editor-container">
                <div className="line-numbers">
                    {linhas.map((num) => (
                        <div key={num} className="line-number">{num}</div>
                    ))}
                </div>
                <textarea
                    ref={textareaRef}
                    className="codigo-editor"
                    value={codigo}
                    onChange={(e) => setCodigo(e.target.value)}
                    placeholder="Cole ou carregue um arquivo de código..."
                />
            </div>

            <h2>Resultado:</h2>
            <pre>{resultado}</pre>
        </div>
    );
}
