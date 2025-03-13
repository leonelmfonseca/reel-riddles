import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import {HttpClient} from '@angular/common/http';

@Component({
    selector: 'app-root', // Mark this as a standalone component
    imports: [CommonModule, FormsModule], // Import dependencies here
    templateUrl: './app.component.html',
    styleUrls: ['../../../ui/src/app/app.component.css']
})
export class AppComponent {
    movieTitle: string[] = [];
    guessedLetter: string = '';

    constructor(private http: HttpClient) {}

    ngOnInit(): void {
        this.initializeGame();
    }

    initializeGame() {
        this.http.get<string[]>('/api/movie-title').subscribe(
            response => {
                this.movieTitle = response;
            },
            error => {
                console.error('Failed to initialize the game', error);
            }
        );
    }

    checkLetter() {
        if (!this.guessedLetter.trim()) return;

        this.http.post<string[]>('/api/check-letter', { letter: this.guessedLetter }).subscribe(
            response => {
                this.movieTitle = response;
            },
            error => {
                if (error.status === 404) {
                    alert('Letter not found in the movie title');
                }
            }
        );
        this.guessedLetter = ''; // Clear the input field
    }
}
