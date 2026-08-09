import { useState } from 'react'
import TrendingSong from './Session1/TrendingSong'
import UserGreeting from './Session2/UserGreeting'
import UserGreetingClass from './Session2/UserGreetingClass'
import MiniProfile from './Session2/MiniProfile'
import ProjectCard from './Session3/ProjectCard'
import UserProfile from './Session3/UserProfile'
import LikeButton from './Session4/LikeButton'
import CartItem from './Session4/CartItem'
import SongVote from './Session4/SongVote'
import Rating from './Session4/Rating'

function App() {

  return (
    <>

    {/* Session - 1
    <h1>Welcome to My React Zomato App</h1>
    <TrendingSong/> */}

     {/* Session 2
    <h1>Welcome to React JSX!</h1>

    <h2>Functional Component</h2>
    <UserGreeting username="Vaibhavi"/>

    <h2>Class Component</h2>
    <UserGreetingClass username="Vaibhavi"/> 

    <MiniProfile/> */}

      {/*Session 3
     <ProjectCard product={{ name : 'MacBook' , price:150000}}/>
      <UserProfile user={ {username:"VJ" , img:"https://images.unsplash.com/photo-1583160247711-2191776b4b91?q=80&w=1171&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D" , followers:1111 }}/>
      <UserProfile/> */}


        {/* Session 4
      <LikeButton/>
      <CartItem/>
      <SongVote/>
      <Rating/> */}

      

    </>
  )
}

export default App
