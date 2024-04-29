<script setup>
const props = defineProps({
  board: {
    type: Object,
    default: () => new Board()
  }
});

const board = props.board;

</script>

<template>
  <tr>
    <td>{{board.id}}</td>
    <td>{{board.name}}</td>
    <td>{{board.contents}}</td>
    <td>{{board.createdAt}}</td>
    <td>{{board.createdBy}}</td>
    <td>{{board.modifiedAt}}</td>
    <td>{{board.modifiedBy}}</td>
  </tr>
</template>

<style scoped>

</style>