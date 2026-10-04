import { Component, signal } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

export interface Jogo { 
  titulo: string;
  genero: string;
  nota: number;
  jogado: boolean;
}

@Component({
  imports: [FormsModule, CommonModule],
  selector: 'app-root',
  styleUrl: './app.css',
  templateUrl: './app.html',
})
export class App {
  
  novoTitulo: string = '';
  novoGenero: string = '';
  novaNota: number = 0;
  novoJogado: boolean = false;

  jogos: Jogo[] = [
  { titulo: 'R.E.P.O.', genero: 'Cooperativo', nota: 8, jogado: true },
  { titulo: 'Hollow Knight', genero: 'Metroidvania', nota: 10, jogado: true },
  { titulo: 'Elden Ring', genero: 'RPG de Ação', nota: 9, jogado: false },
  { titulo: 'Stardew Valley', genero: 'Simulação', nota: 7, jogado: true },
  { titulo: 'Cyberpunk 2077', genero: 'RPG', nota: 4, jogado: false },
];

  adicionarJogo(){
    if(this.novoTitulo.trim() && this.novoGenero.trim()){
      this.jogos.push({
        titulo: this.novoTitulo,
        genero: this.novoGenero,
        nota: Math.min(10, Math.max(0, Number(this.novaNota) || 0)),
        jogado: this.novoJogado
      });
      this.novoTitulo = '';
      this.novoGenero = '';
      this.novaNota = 0;
      this.novoJogado = false;
    }
  }

  alterarJogado(index: number){
    this.jogos[index].jogado = !this.jogos[index].jogado
  }

  removerJogo(index: number){
    this.jogos.splice(index, 1);
  }
}