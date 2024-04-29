<template>
  <button @click="onCreateButtonClick">Create</button>
  <button @click="onSearchButtonClick">Search</button>

  <table>
    <thead>
      <tr>
        <th>seq</th>
        <th>제목</th>
        <th>내용</th>
        <th>생성일</th>
        <th>생성자</th>
        <th>수정일</th>
        <th>수정자</th>
      </tr>
    </thead>
    <tbody>
      <BoardTableRow v-for="board  in boards" :board="board" />
    </tbody>
  </table>

</template>

<script setup>
import BoardTableRow from "~/components/boards/BoardTableRow.vue";
import {BoardUseCase} from "~/use-cases/BoardUseCase.js";
import {Board} from "~/models/Board.js";

const boardUseCase = new BoardUseCase();
const boards = ref([]);

onMounted(() => {
  load();
})

const load = async () => {
  boards.value = await boardUseCase.load();
}

const onCreateButtonClick = async () => {
  const board = new Board({
    userId: crypto.randomUUID(),
    name: '제목',
    contents: '내용'
  });

  await boardUseCase.save(board);

  await load();
}

const onSearchButtonClick = async () => {
  await load();
}

</script>