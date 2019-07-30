<template>
  <div id="app">
    <people-view/>
  </div>
</template>

<script>
import PeopleView from './components/PeopleView.vue'

export default {
  name: 'app',
  components: {
    PeopleView
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
