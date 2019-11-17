import { Component, OnInit } from '@angular/core';
import { Movie } from '../movies';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {
  movies: Movie[] = [
    {
      name: 'Adventure ',
      imgURL: 'https://cdn.pixabay.com/photo/2017/06/29/00/10/movie-poster-2452656__340.jpg',
      rating: '5/10',
      specs: `Deprived of his mighty hammer Mjolnir, Thor must escape the other side of the universe to
       save his home, Asgard, from Hela, the goddess of death.`
    },
  
    {
      name: 'Charlie chaplin',
      imgURL: 'https://cdn.pixabay.com/photo/2016/03/21/20/01/chaplin-1271422__340.jpg',
      rating: '10/10',
      specs: `Sir Charles Spencer Chaplin KBE was an English comic actor, filmmaker, and composer who
       rose to fame in the era of silent film. He became a worldwide icon through his screen persona,
        "The Tramp", and is considered one of the most important figures in the history of the film 
        industry.`
    },
    {
      name: 'Spider Man',
      imgURL: 'https://cdn.pixabay.com/photo/2019/04/08/16/27/spiderman-4112322__340.jpg',
      rating: '7/10',
      specs: `Spider-Man is a fictional superhero created by writer-editor Stan Lee and writer-artist
       Steve Ditko. He first appeared in the anthology comic book Amazing Fantasy #15 in the Silver Age 
       of Comic Books.`
    }
    
  
  ];
  selectedMovie: Movie = this.movies[0];
  
  constructor() { }
  selectMovie(movie){
    this.selectedMovie = movie;
  }
  ngOnInit() {
  }

}
